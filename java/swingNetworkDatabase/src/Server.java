import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Server {
public static void main(String [] args) {
        
        ServerSocket server = null;
        Socket client;
        
        // Default port number we are going to use
        int portnumber = 1234;
       
        
        // Create Server side socket
        try {
            server = new ServerSocket(portnumber);
        } catch (IOException ie) {
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        System.out.println("ServerSocket is created " + server);
        
        // Wait for the data from the client and reply
        while(true) {
            
            try {
                
               
                System.out.println("Waiting for connect request...");
                client = server.accept();
                
                System.out.println("Connect request is accepted...");
                String clientHost = client.getInetAddress().getHostAddress();
                int clientPort = client.getPort();
                System.out.println("Client host = " + clientHost + " Client port = " + clientPort);
                
                // Read data from the client
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(clientIn));
               
                String msgFromClient = br.readLine();
                // Send response to the client
                if (msgFromClient != null ) {
                    OutputStream clientOut = client.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    
                    try {
                    	 
                         System.out.println("ID received from client = " + msgFromClient);
                         
                         
                         String arr[]=msgFromClient.split(" ");
                         System.out.println(arr);
                         
                         System.out.println(arr.length);
                         if(arr.length==1)
                         {
                        	 System.out.println(arr[0]);
                         	int id=Integer.parseInt(arr[0]);
                            System.out.println(id);
                             EmployeeService emp=new EmployeeServiceImpl();
     						
     						Employee ansMsg = emp.getEmployeeById(id);
     						
     						System.out.println(ansMsg.getFirstName()+" "+ansMsg.getLastName()+" "+ansMsg.getEmail());
     						pw.println(ansMsg.getFirstName()+" "+ansMsg.getLastName()+" "+ansMsg.getEmail());
                             
                         }
                         else {
                        	 int iD=Integer.parseInt(arr[0]);
     						String fname=arr[1];
     						String lname=arr[2];
     						String email=arr[3];
     						
     						EmployeeService em=new EmployeeServiceImpl();
     						em.createEmployee(new Employee(iD,fname,lname,email));

                         }
                         
						
						
						
						
						
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
                    
            
                    
                }
                
            } catch (IOException ie) {
            }
        }
    }



}

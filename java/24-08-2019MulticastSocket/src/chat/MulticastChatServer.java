package chat;
import java.net.*;

public class MulticastChatServer {
    
    public static void main(String args[])
    throws Exception {
        
        // Default port number we are going to use
        int portnumber = 1236;
      
        
        // Create a MulticastSocket
        MulticastSocket serverMulticastSocket =
                new MulticastSocket(portnumber);
        System.out.println("MulticastSocket is created...");
        
        // Determine the IP address of a host, given the host name
        InetAddress group =
                InetAddress.getByName("225.0.0.1");
        
        // getByName- returns IP address of given host
        serverMulticastSocket.joinGroup(group);
        System.out.println("joinGroup method is called...");
        boolean infinite = true;
        
        // Continually receives data and prints them 
        while(infinite) {
            byte buf[] = new byte[1024];
            DatagramPacket data =
                    new DatagramPacket(buf, buf.length);
            serverMulticastSocket.receive(data);
            String msg =
                    new String(data.getData()).trim();
            System.out.println("Message received from client = " + msg);
        }
        serverMulticastSocket.close();
    }
}
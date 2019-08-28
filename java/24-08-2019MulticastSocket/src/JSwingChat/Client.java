package JSwingChat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(23, 77, 169, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		        
		        // Default port number we are going to use
		        int portnumber = 1236;
		       
		        
		        // Create a MulticastSocket
		        MulticastSocket chatMulticastSocket;
				try {
					chatMulticastSocket = new MulticastSocket(portnumber);
					 // Determine the IP address of a host, given the host name
			        InetAddress group =
			                InetAddress.getByName("228.0.0.1");
			        
			        // Joins a multicast group
			        chatMulticastSocket.joinGroup(group);
			        
			        // Prompt a user to enter a message
			        String msg = "";
			        //System.out.println("Type a message for the server:");
			        
			        msg=textField.getText();
//			        System.out.println(message);
//			        BufferedReader br =
//			                new BufferedReader(new InputStreamReader(System.in));
//			        msg = br.readLine();
			        BufferedWriter writer = new BufferedWriter(new FileWriter("chat.txt"));
			        writer.write("Message is "+msg);
			        System.out.println(msg);
			        writer.close();
			        
			        
			       
			        
			        // Send the message to Multicast address
			        DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portnumber);
			        chatMulticastSocket.send(data);
			        
			        // Close the socket
			        chatMulticastSocket.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		       
			}
		});
		btnSend.setBounds(221, 76, 89, 23);
		contentPane.add(btnSend);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 127, 328, 104);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		button = new JButton("New button");
		button.setBounds(320, 76, 89, 23);
		contentPane.add(button);
	}

}

private static void appendUsingBufferedWriter(String filePath, String text, int noOfLines) {
	File file = new File(filePath);
	FileWriter fr = null;
	BufferedWriter br = null;
	try {
		// to append to file, you need to initialize FileWriter using below constructor
		fr = new FileWriter(file, true);
		br = new BufferedWriter(fr);
		for (int i = 0; i < noOfLines; i++) {
			br.newLine();
			// you can use write or append method
			br.write(text);
		}

	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
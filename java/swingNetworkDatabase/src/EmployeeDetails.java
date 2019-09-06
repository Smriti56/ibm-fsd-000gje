import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class EmployeeDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDetails frame = new EmployeeDetails();
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
	public EmployeeDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterId = new JLabel("Enter ID");
		lblEnterId.setBounds(97, 50, 46, 14);
		contentPane.add(lblEnterId);
		
		textField = new JTextField();
		textField.setBounds(174, 47, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnFindbyid = new JButton("FindByID");
		btnFindbyid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				Socket client = null;
		        int portnumber = 1234;
		        
		        try {
					client = new Socket(InetAddress.getLocalHost(), portnumber);
					 System.out.println("Client socket is created " + client);
					 
					 OutputStream clientOut = client.getOutputStream();
			         PrintWriter pw = new PrintWriter(clientOut, true);
			         
			         InputStream clientIn = client.getInputStream();
			         BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
			          
			         BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			         
			         int id=Integer.parseInt(textField.getText());
						System.out.println(id);
						
					pw.println(id);
					 
					textField_1.setText(br.readLine());
					
			            pw.close();
			            br.close();
			            client.close();
					
					
			            
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	           
			}
		});
		btnFindbyid.setBounds(292, 46, 89, 23);
		contentPane.add(btnFindbyid);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 94, 315, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				Socket client = null;
		        int portnumber = 1234;
		        
		        try {
					client = new Socket(InetAddress.getLocalHost(), portnumber);
					 System.out.println("Client socket is created " + client);
					 
					 OutputStream clientOut = client.getOutputStream();
			         PrintWriter pw = new PrintWriter(clientOut, true);
			         
			         InputStream clientIn = client.getInputStream();
			         BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
			          
			         BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			         
			         String data=textField_1.getText();
			         System.out.println(data);
						
					pw.println(data);
					 
					textField_1.setText(br.readLine());
					
			            pw.close();
			            br.close();
			            client.close();
					
					
			            
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
			}
		});
		btnSave.setBounds(174, 158, 89, 23);
		contentPane.add(btnSave);
	}
}
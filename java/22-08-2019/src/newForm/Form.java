package newForm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.awt.event.ActionEvent;

public class Form extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterText = new JLabel("ENTER TEXT");
		lblEnterText.setBounds(164, 28, 77, 25);
		contentPane.add(lblEnterText);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(59, 74, 306, 124);
		contentPane.add(textPane);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input=(textPane.getText().toString());

				File outputFile=new File("out.txt");
				FileWriter out = null;
				
				try {
					out = new FileWriter(outputFile);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			
				PrintWriter outputStream = new PrintWriter(out);
				System.out.println(input);
				outputStream.println(input);
				
				try {
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			
				
			}
		});
		btnSave.setBounds(80, 216, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnRead = new JButton("READ");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File inputFile=new File("out.txt");
				FileReader in = null;
				try {
					in = new FileReader(inputFile);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
				BufferedReader inputStream = new BufferedReader(in);
				
				try {
					textPane.read(inputStream,"out.txt");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				}
		});
		btnRead.setBounds(217, 216, 89, 23);
		contentPane.add(btnRead);
	}
}

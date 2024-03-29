package comm.example.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import swing.Display;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Emp extends JFrame {

	EmployeeServiceImpl service;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws SQLException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp frame = new Emp();
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
	public Emp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(69, 46, 74, 31);
		contentPane.add(lblEmployeeId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(69, 96, 74, 31);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(69, 147, 74, 31);
		contentPane.add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(69, 189, 74, 31);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(182, 51, 86, 20);
		contentPane.add(textField);
		textField.setColumns(25);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 101, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(25);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 152, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(25);
		
		textField_3 = new JTextField();
		textField_3.setBounds(182, 194, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(25);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					service = new EmployeeServiceImpl();
					service.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddEmployee.setBounds(48, 231, 110, 23);
		contentPane.add(btnAddEmployee);
		
		
		
		
		JButton btnReset = new JButton("Reset");
		

		btnReset.setBounds(182, 231, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnFindById = new JButton("Find By ID");
		btnFindById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnFindById.setBounds(299, 231, 89, 23);
		contentPane.add(btnFindById);
		
		JButton btnDeleteById = new JButton("Delete By ID");
		btnDeleteById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					service = new EmployeeServiceImpl();
					service.deleteEmployeeById(Integer.parseInt(textField.getText().toString()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDeleteById.setBounds(299, 50, 89, 23);
		contentPane.add(btnDeleteById);
		
		JButton btnDisplayData = new JButton("Display Data");
		btnDisplayData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Display();
			}
		});
		btnDisplayData.setBounds(299, 193, 89, 23);
		contentPane.add(btnDisplayData);
	}
}

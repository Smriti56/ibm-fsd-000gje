package comm.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.model.Employee;
import comm.example.factory.MyConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao{
	

	private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	

	public EmployeeDaoImpl() throws SQLException {
		super();
		 connection = MyConnectionFactory.getMySqlConnectionForHR();
	}

	@Override
	public void createEmployee(Employee employee) {
		
		
		try {
			pStatement=connection.prepareStatement("insert into employee(name,email,password,country)values(?,?,?,?)");
			
			pStatement.setString(1, employee.getName());
			pStatement.setString(2, employee.getEmail());
			pStatement.setString(3, employee.getPasssword());
			pStatement.setString(4, employee.getCountry());
			pStatement.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=new ArrayList<Employee>();
		try {
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from employee");
			while(resultSet.next())
			{
				list.add(new Employee(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void deleteEmployeeById(int id) {
		try {
			pStatement=connection.prepareStatement("delete from employee where id=?");
			pStatement.setInt(1, id);
			pStatement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Employee getEmployeeById(int id) {
try {
			
			PreparedStatement stmt=connection.prepareStatement("select * from employee where id=?");  
			stmt.setInt(1, id);
			resultSet =stmt.executeQuery();
			resultSet.next();
			System.out.println(resultSet.getString(2));
			return (new Employee(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5) ));
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void edit(Employee employee) throws SQLException {
		PreparedStatement stmt=connection.prepareStatement("update employee set name=?, email=?, password=?, country=? where id=?");  
		pStatement.setString(1, employee.getName());
		pStatement.setString(2, employee.getEmail());
		pStatement.setString(3, employee.getPasssword());
		pStatement.setString(4, employee.getCountry());
		pStatement.setInt(5, employee.getId());
		resultSet =stmt.executeQuery();
		resultSet.next();
	}

	

}

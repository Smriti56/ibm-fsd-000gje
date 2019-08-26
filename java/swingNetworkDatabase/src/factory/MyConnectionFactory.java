package factory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {
	
	private static Connection connection;
	private static MyConnectionFactory factory=null;
	
	private MyConnectionFactory() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	}
	
	
	public static MyConnectionFactory createObject() throws SQLException
	{
		if(factory==null)
		{
			factory=new MyConnectionFactory();
		}
		return factory;
	}
	
	public Connection getConnection()throws SQLException
	{
		return connection;
	}
}
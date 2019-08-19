package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcDemo {
	private static Properties properties=null;
	
	static {
		properties=new Properties();
		properties.put("JDBC_URL","jdbc:mysql://localhost:3306/XIBM");
		properties.put("USER","root");
		properties.put("PASSWORD","root");
	}
	
	public JdbcDemo()
	{
		super();
		
	}
	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
//		DriverManager.registerDriver(new org.h2.Driver());
//		Class.forName("org.h2.Driver");
//		
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr");
		Connection connection=DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.getProperty("USER"),properties.getProperty("PASSWORD"));
		System.out.println(connection);
		
		
	}

}

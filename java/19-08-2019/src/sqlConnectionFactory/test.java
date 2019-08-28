package sqlConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test {
public static void main(String[] args) throws SQLException {

	MySqlConnectionFactory factory=MySqlConnectionFactory.createConnection();
	
	Scanner scanner=new Scanner(System.in);
	
	Connection connection=factory.getConnection();
	
	// to insert
	
//	PreparedStatement pst=connection.prepareStatement("insert into EIBM values(?,?,?)");
//	System.out.print("Eid: ");
//	int id=scanner.nextInt();
//	System.out.print("Ename: ");
//	String name=scanner.next();
//	System.out.print("Email: ");
//	String email=scanner.next();
//	pst.setInt(1, id);
//	pst.setString(2, name);
//	pst.setString(3, email);
//	int count=pst.executeUpdate();
//	System.out.println(count+" row(s) updated");
	
	
	
	//to update
	
//	PreparedStatement ps =connection.prepareStatement("update EIBM set Email=? where Eid=?");
//	System.out.println("eid where email need to change");
//	int eid=scanner.nextInt();
//	System.out.println("enter email need to change");
//	String eEmail=scanner.next();
//	ps.setInt(2, eid);
//	ps.setString(1, eEmail);
//	int c=ps.executeUpdate();
//	System.out.println(c+"row updated");
	
	
	
	//to delete
	PreparedStatement stmt=connection.prepareStatement("delete from EIBM where Eid=?");  
	System.out.println("Enter the eid you want to delete");
	int eId= scanner.nextInt();
	stmt.setInt(1,eId);    
	int i=stmt.executeUpdate();  
	System.out.println(i+" records deleted"); 
	
	//to search
	PreparedStatement st=connection.prepareStatement("Select * from EIBM where eid=?");
	System.out.println("Enter the id you want to search");
	int id=scanner.nextInt();
	st.setInt(2,id);
	int in=st.executeUpdate();
	System.out.println(in+"updated");
}
}

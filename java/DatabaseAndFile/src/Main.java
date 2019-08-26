import java.io.*;
import java.sql.SQLException;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Main {

	public static void main(String args[]) throws IOException, SQLException {
//		
//		BufferedReader reader = new BufferedReader(new FileReader("Employee.txt"));
//		String line=reader.readLine();
//		EmployeeService emp = new EmployeeServiceImpl();
//		
//		while(line!=null)
//		{
//			//System.out.println(line);
//			
//			String[] data=line.split(" ");
//			int id=Integer.parseInt(data[0]);
//			String fname=data[1];
//			String lname=data[2];
//			String email=data[3];
//			emp.createEmployee(new Employee(id,fname,lname,email));
//			line=reader.readLine();
//		}
//		
//		
		BufferedWriter writer = new BufferedWriter(new FileWriter("Deatils.txt"));
		EmployeeService em = new EmployeeServiceImpl();

		for (Employee e : em.getAllEmployees()) {
			writer.write(e.getId()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getEmail()+"\n");
			System.out.println(e.getId()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getEmail()+"\n");
		}
		writer.close();

	}

}

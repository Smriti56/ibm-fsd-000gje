package assessment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {


	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		List<Employee> emplist= new ArrayList<Employee>();
		
		System.out.println("Input the no of Employees");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the details for Employee"+i);
			String name=sc.next();
			String dept=sc.next();
			String dt=sc.next();
			Date date = null;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(dt);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int age=sc.nextInt();
			int sal=sc.nextInt();
			Employee e=new Employee(i,name, dept,date, age, sal);
			emplist.add(e);
		}
		int ans;
		
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of joining");
		System.out.println("Enter your choice");
		ans=sc.nextInt();
		switch(ans)
		{
		case 1:
			
			Collections.sort(emplist);
			for(Employee e:emplist)
			{
				EmployeeBO.printEmployee(e);
			}
			break;
		case 2:
			
			Collections.sort(emplist, null);
			for(Employee e:emplist)
			{
				EmployeeBO.printEmployee(e);
			}
			break;
		}
		
	}
}

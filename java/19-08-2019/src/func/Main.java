package func;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		String name;
		int id;
		double sal;
		
		List<Employee> list= new ArrayList<Employee>();
		List<Employee> alist= new ArrayList<Employee>();
		char ans ='y';
		do
		{
			System.out.println("Enter 1 to add, 2 to delete, 3 to update , 4 to search");
			Scanner sc= new Scanner(System.in);
			n=sc.nextInt();
			Employee e = new Employee();
			
			switch(n) {
			case 1:{
				System.out.println("Enter the details of new user (id, name, salary)");
				id=sc.nextInt();
				name=sc.next();
				sal=sc.nextDouble();
				alist=e.addEmployee(id,name,sal,list);
				System.out.println(alist);
				break;
			}
			case 2:
			{
				System.out.println("Enter the id you want to delete");
				id=sc.nextInt();
				try {
					alist=e.deleteEmployee(id,list);
				} catch (EmployeeNotFound e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMsg());
				}
				System.out.println(alist);
				break;
				
			}
			
			case 3:
			{
				System.out.println("Enter the id you want to update");
				id=sc.nextInt();
				System.out.println("Enter the salary");
				sal=sc.nextDouble();
				try {
					alist=e.updateEmployee(id,sal,list);
				} catch (EmployeeNotFound e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMsg());
				}
				System.out.println(alist);
				break;	
			}
			case 4:
			{
				Employee emp = new Employee();
				System.out.println("Enter the id you want to delete");
				id=sc.nextInt();
				try {
					emp=e.searchEmployee(id,list);
				} catch (EmployeeNotFound e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMsg());
				}
				System.out.println(emp);
				break;
				
			}
				
			
			
			}
			
			System.out.println("Do you want to continue");
			ans=sc.next().charAt(0);
			
		}while(ans=='y');
		
		
		
		
		
		
	}

	

}

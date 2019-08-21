package assessment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	
	{
		List<Contact> contact=new ArrayList<Contact>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of contacts:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter contact "+i +"detail");
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter number");
			long mobile=sc.nextLong();
			System.out.println("Enter address");
			String add=sc.next();
			contact.add(new Contact(name, email, mobile, add));			
			
		}
		
		Collections.sort(contact);
		
		for(Contact ct:contact){    
			System.out.println(ct.getName()+"-"+ct.getMobile());    
			}   
	}

}

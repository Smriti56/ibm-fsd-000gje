package name;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String firstName;
		String lastName;
		int ans;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name");
		firstName=sc.next();
		System.out.println("Enter last name");
		lastName=sc.next();
		
		Name n1 = new Name(firstName,lastName);
		
		System.out.println("Do you want to enter another user? (y/n)");
		ans=sc.next().charAt(0);
		
		if(ans=='y') {
			System.out.println("Enter first name");
			firstName=sc.next();
			System.out.println("Enter last name");
			lastName=sc.next();
			
			Name n2 = new Name(firstName,lastName);
			
			Name nm= new Name();
			try {
				nm.newName(n1, n2);
			} catch (AccountAlreadyExist e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
	
	
	

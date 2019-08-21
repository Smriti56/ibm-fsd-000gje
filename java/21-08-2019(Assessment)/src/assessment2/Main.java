package assessment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String pass= sc.next();
		
		if(new UserMainCode().checkPassword(pass))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
		
	

}
}

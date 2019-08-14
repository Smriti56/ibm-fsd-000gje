package enumeration;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
	
	public static Scanner scanner= new Scanner(in);
	public static void main(String[] args)
	{
		String name=null;
		try {
			out.println("Coach Name:");
			name=scanner.next();
			TennisCoach myCoach = new TennisCoach();
			myCoach.createCoach("tom", Level.LOW);
			out.println(myCoach.getCoachDetails().toString());
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			out.println(e.getMessage());
		}
		
			
	}

}

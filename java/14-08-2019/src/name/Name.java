package name;
import java.io.Serializable;
import java.util.Scanner;

public class Name implements Serializable{

	private static final long serialVersionUID = -867406614572692900L;
	
	private String firstName;
	private String lastName;
	
	Scanner sc= new Scanner(System.in);
	
	
	public Name() {
		super();
	}
	

	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	



	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}



	public Name newName(Name name1,Name name2) throws AccountAlreadyExist{
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1.equals(name2));
	
				if((name1.toString()).equals((name2.toString()))) {
					throw new AccountAlreadyExist("User Already exist");
				}
				else
				{
					System.out.println(" New User ADDED");
				}
			return name1;
			
	}



	
	
	
	

}

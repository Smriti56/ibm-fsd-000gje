package compararbleAndcomparator;

public class Student implements Comparable <Object>{
	
	private String firstName;
	private String lastName;
	private double GPA;
	
	
	

	public Student() {
		super();
	}




	public Student(String firstName, String lastName, double gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
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




	public double getGPA() {
		return GPA;
	}




	public void setGPA(double gPA) {
		GPA = gPA;
	}

	



	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", GPA=" + GPA + "]";
	}




	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student student=(Student) o;
		if((this.getGPA()==(student.getGPA())))
		{
			return 0;
		}
		else if((this.getGPA()>(student.getGPA())))
		{
			return 1;
		}
		else return -1;
	}

}

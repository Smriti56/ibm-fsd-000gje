package EmployeeDetails;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String dept;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String firstName, String lastName, String dept) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}
	
	protected String getDetails() {
		return (id+" "+firstName+" "+lastName+" "+dept);
	}
	
	

}

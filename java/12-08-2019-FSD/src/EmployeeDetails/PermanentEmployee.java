package EmployeeDetails;

public class PermanentEmployee extends Employee{
	private int salary;

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(int salary) {
		super(1 ,"Smriti", "Chaurasia", "cse");
		this.salary = salary;
	}
	
	
	protected String getDetails(){
		return(super.getDetails()+" salary :"+ salary);
	}

}

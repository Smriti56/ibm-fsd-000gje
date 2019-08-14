package EmployeeDetails;

public class ContractEmployee extends Employee{
	private int payperhour;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(int payperhour) {
		super(1 ,"Smriti", "Chaurasia", "cse");
		this.payperhour = payperhour;
	}
	
	protected String getDetails() {
		return (super.getDetails()+"payperhour"+" "+payperhour);
	}
	

}

package EmployeeDetails;

public class Emp extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee y1;
		String det1,det2;
		
		y1=new PermanentEmployee(1000);
		//y1.getDetails()
		det1=y1.getDetails();
		System.out.println(det1);
		
		Employee y2;
		y2=new ContractEmployee(2000);
		det2=y2.getDetails();
		System.out.println(det2);
		
				

}
}

package assessment1;

import java.util.Date;

public class EmployeeBO {

	public static void printEmployee(Employee e)
	{
		System.out.printf("%d  %-15s %-30s %-30s %-10s %-10s\n",e.getId(),e.getName(),e.getDepartment(),e.getDateOfJoining(),e.getAge(),e.getSalary());
	}
}

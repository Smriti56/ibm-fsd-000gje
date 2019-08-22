package assessment1;

import java.util.Comparator;
import java.util.Date;

public class AgeComparator implements Comparator<Employee>{
	
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		if(emp1.getAge()==emp2.getAge())
		{
			if(emp1.getDateOfJoining().equals(emp2.getDateOfJoining()))
			{
				return 0;
			}
			else if(emp1.getDateOfJoining().before(emp2.getDateOfJoining()))
			{
				return 1;
			}
			else return -1;
		}
		else if(emp1.getAge()>emp2.getAge())
		{
			return 1;
		}
		else
			return -1;
		
	}
	
	
	

}

package compararbleAndcomparator;

import java.util.Set;
import java.util.TreeSet;

public class Mian {
	public static void main(String args[])
	{
		Set <Student> set =new TreeSet<Student>();
		set.add(new Student("john","A",8.9));
		set.add(new Student("bob","A",5.9));
		set.add(new Student("adam","A",7.99));
		set.add(new Student("jill","A",10.9));
		
		
		Object[] obj=set.toArray();
		
		
		Student s=null;
		for(Object o:set)
		{
			s=(Student) o;
			System.out.println(s.toString());
		}
		
		for(Object o: obj)
		{
			s=(Student) o;
			System.out.printf("\nname: %s %s GPA: %.1f",s.getFirstName(),s.getLastName(),s.getGPA());
		}
		
	}

}

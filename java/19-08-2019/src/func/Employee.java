package func;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	
	
	public Employee() {
		super();
	}




	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}




	public List<Employee> addEmployee(int id, String name, double sal,List list) {
		Employee e= new Employee(id,name,sal);
		list.add(e);
		
		return list;
	}




	public List<Employee> deleteEmployee(int id2, List<Employee> list) 	throws EmployeeNotFound{
		//Employee obj= new Employee();
		System.out.println(id2);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).id==id2)
			{
				list.remove(list.get(i));
				return list;
			}	
		}
		
		throw new EmployeeNotFound("Employee not found");
		
	}




	public List<Employee> updateEmployee(int id2, double sal, List<Employee> list)  throws EmployeeNotFound{
		 
		String name;
		System.out.println(id2);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).id==id2)
			{
				name=list.get(i).name;
				Employee obj= new Employee(id2,name,sal);
				list.remove(list.get(i));
				list.add(obj);
				return list;
			}	
		}
		throw new EmployeeNotFound("Employee not found");
		
	}




	public Employee searchEmployee(int id2, List<Employee> list) throws EmployeeNotFound{
		Employee obj = null;
		String name;
		double sal;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).id==id2)
			{
				name=list.get(i).name;
				sal=list.get(i).salary;
				obj= new Employee(id2,name,sal);
				return obj;
			}	
		}
		throw new EmployeeNotFound("Employee not found");
		
	}

}

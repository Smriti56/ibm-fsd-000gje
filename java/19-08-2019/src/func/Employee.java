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




	public List<Employee> deleteEmployee(int id2, List<Employee> list) {
		list.remove(id2);
		return list;
	}

}

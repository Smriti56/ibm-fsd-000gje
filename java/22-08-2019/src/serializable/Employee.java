package serializable;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -9010357829331880115L;
	
	private String id;
	private String name;
	private double salary;
	private transient String address;
	
	
	
	public Employee() {
		super();
	}



	public Employee(String id, String name, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}

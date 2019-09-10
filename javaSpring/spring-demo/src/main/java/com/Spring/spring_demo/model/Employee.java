package com.Spring.spring_demo.model;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Address add;
	public Employee() {
		//super();
	}
	
	
	
	
	public Employee(int id, String firstName, String lastName, String email, Address add) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.add = add;
	}
	
	



	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Address getAdd() {
		return add;
	}




	public void setAdd(Address add) {
		this.add = add;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", add=" + add + "]";
	}
	public String getDetails()
	{
		return toString();
	}

}

package com.mycompany.spring_demo.model;

public class Employee {

	private int id;
	private String firstname;
	private String lasttname;
	private String email;
	
	
	
	public Employee() {
		super();
	}



	public Employee(int id, String firstname, String lasttname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lasttname = lasttname;
		this.email = email;
	}
	
	
}

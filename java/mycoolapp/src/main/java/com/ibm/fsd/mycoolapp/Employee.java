package com.ibm.fsd.mycoolapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="employee")
@Data

public class Employee {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="country")
	private String country;
	
	
	
	public Employee() {
		super();
	}



	public Employee(String name, String email, String password, String country) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.country = country;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", country="
				+ country + "]";
	}
	
	
	

}

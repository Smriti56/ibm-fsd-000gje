package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="height")
	private double height;
	@Column(name="weight")
	private double weight;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="bmi")
	private double bmi;
	@Column(name="category")
	private String category;
	
	public User() {
		super();
	}


	

	

	public User(int id, String firstName, String lastName, String email, String password, double height, double weight,
			int age, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
	}


	




	

	public User(int id, String firstName, String lastName, String email, String password, double height, double weight,
			int age, String gender, String category, double bmi) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.category = category;
		this.bmi = bmi;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCategory() {
		return category;
	}


	
	


	public void setCategory(String category) {
		this.category = category;
	}






	public double getBmi() {
		return bmi;
	}






	public void setBmi(double bmi) {
		this.bmi = bmi;
	}


	





	
	
	
	

}

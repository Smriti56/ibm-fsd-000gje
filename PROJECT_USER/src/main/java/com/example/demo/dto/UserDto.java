package com.example.demo.dto;

public class UserDto {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double height;
	private double weight;
	private int age;
	private String gender;
	private double bmi;
	private String category;
	
	public UserDto() {
		super();
	}

	public UserDto(String firstName, String lastName, String email, String password, double height, double weight,
			int age, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
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

	public double getBmi() {
		return bmi;
	}

	
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", height=" + height + ", weight=" + weight + ", age=" + age + ", gender=" + gender
				+ ", bmi=" + bmi + ", category=" + category + "]";
	}
	
	
	
}

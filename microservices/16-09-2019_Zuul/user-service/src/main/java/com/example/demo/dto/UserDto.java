package com.example.demo.dto;

import java.util.UUID;

public class UserDto {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String user_id;
	
	
	
	public UserDto() {
		super();
	}


	public UserDto(String firstName, String lastName, String email, String password, String user_id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.user_id = UUID.randomUUID().toString();
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
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	

}

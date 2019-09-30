package com.example.demo.model;

public class UserResponse {

	private double bmi;
	private String category;
	
	
	
	public UserResponse() {
		super();
	}



	public UserResponse(double bmi, String category) {
		super();
		this.bmi = bmi;
		this.category = category;
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
	
}

package com.example.demo.model;

public class ErrorModel {

	private String message;

	public ErrorModel() {
		super();
		
	}
	
	public ErrorModel(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

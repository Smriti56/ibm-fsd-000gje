package com.example.demo.entity;



public class Patient {
	
	private int id;
	private String disease;
	private String name;
	
	
	
	public Patient() {
		super();
	}



	



	public Patient(int id, String disease, String name) {
		super();
		this.id = id;
		this.setDisease(disease);
		this.name = name;
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







	public String getDisease() {
		return disease;
	}







	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	
	

}

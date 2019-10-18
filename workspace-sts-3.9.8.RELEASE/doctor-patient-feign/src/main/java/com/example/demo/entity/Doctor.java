package com.example.demo.entity;



public class Doctor {
	
	private int id;
	private String speciality;
	private String name;
	
	
	
	public Doctor() {
		super();
	}



	



	public Doctor(int id, String speciality, String name) {
		super();
		this.id = id;
		this.speciality = speciality;
		this.name = name;
	}







	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSpeciality() {
		return speciality;
	}



	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

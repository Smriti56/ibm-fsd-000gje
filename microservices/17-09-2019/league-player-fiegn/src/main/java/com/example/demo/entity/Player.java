package com.example.demo.entity;


public class Player {
	

	private int id;
	private String name;
	private String email;
	private String sports;
	
	
	public Player() {
		super();
	}



	public Player( int id,String name, String email, String sports) {
		super();
		this.setId(id);
		this.name = name;
		this.email = email;
		this.sports=sports;
	}
	

	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSports() {
		return sports;
	}



	public void setSports(String sports) {
		this.sports = sports;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	

	
}

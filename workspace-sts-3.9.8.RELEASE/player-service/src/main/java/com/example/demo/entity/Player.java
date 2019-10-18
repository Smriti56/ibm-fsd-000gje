package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String sports;
	
	
	public Player() {
		super();
	}



	public Player(int id, String name, String email, String sports) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.sports=sports;
	}
	

	public Player(String name, String email, String sports) {
		super();
		this.name = name;
		this.email = email;
		this.sports = sports;
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
	
	
	

	
}

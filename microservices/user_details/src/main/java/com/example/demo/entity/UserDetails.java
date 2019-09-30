package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private int dayno;
	private String exercise;
	public UserDetails() {
		super();
	}
	public UserDetails(int id, String email, int dayno, String exercise) {
		super();
		this.id = id;
		this.email = email;
		this.dayno = dayno;
		this.exercise = exercise;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDayno() {
		return dayno;
	}
	public void setDayno(int dayno) {
		this.dayno = dayno;
	}
	public String getExercise() {
		return exercise;
	}
	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	
	

}

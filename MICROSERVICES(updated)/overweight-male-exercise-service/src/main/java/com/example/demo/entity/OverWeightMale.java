package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "overweight_male_workout")
public class OverWeightMale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int day;
	private String exerciseName;
	private String exerciseDescription;
	private int amount;
	private String exerciseUrl;

	public OverWeightMale() {
		super();
	}

	public OverWeightMale(int day, String exerciseName, String exerciseDescription, int amount, String exerciseUrl) {
		super();
		this.day = day;
		this.exerciseName = exerciseName;
		this.exerciseDescription = exerciseDescription;
		this.amount = amount;
		this.exerciseUrl = exerciseUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public String getExerciseDescription() {
		return exerciseDescription;
	}

	public void setExerciseDescription(String exerciseDescription) {
		this.exerciseDescription = exerciseDescription;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getExerciseUrl() {
		return exerciseUrl;
	}

	public void setExerciseUrl(String exerciseUrl) {
		this.exerciseUrl = exerciseUrl;
	}

}

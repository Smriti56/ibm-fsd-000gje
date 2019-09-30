package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "normal_female_meal")
public class NormalWeightMeal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String breakfast;
	private String lunch;
	private String snack;
	private String dinner;

	public NormalWeightMeal() {
		super();
	}

	public NormalWeightMeal( String breakfast, String lunch, String snack, String dinner) {
		super();
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.snack = snack;
		this.dinner = dinner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getSnack() {
		return snack;
	}

	public void setSnack(String snack) {
		this.snack = snack;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

}

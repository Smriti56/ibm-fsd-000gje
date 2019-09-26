package com.example.demo.model;

import java.util.List;

public class ResponseModel {

	private int day;
	private String[] breakfast;
	private String[] lunch;
	private String[] snack;
	private String[] dinner;

	public ResponseModel() {
		super();
	}

	public ResponseModel(int day, String[] breakfast, String[] lunch, String[] snack, String[] dinner) {
		super();
		this.day = day;
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.snack = snack;
		this.dinner = dinner;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String[] getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String[] breakfast) {
		this.breakfast = breakfast;
	}

	public String[] getLunch() {
		return lunch;
	}

	public void setLunch(String[] lunch) {
		this.lunch = lunch;
	}

	public String[] getSnack() {
		return snack;
	}

	public void setSnack(String[] snack) {
		this.snack = snack;
	}

	public String[] getDinner() {
		return dinner;
	}

	public void setDinner(String[] dinner) {
		this.dinner = dinner;
	}

}

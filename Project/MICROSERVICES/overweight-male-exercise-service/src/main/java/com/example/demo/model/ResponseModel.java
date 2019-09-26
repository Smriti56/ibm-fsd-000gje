package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.OverWeightMaleDto;

public class ResponseModel {

	private int day;
	List<OverWeightMaleDto> workout;

	public ResponseModel() {
		super();
	}

	public ResponseModel(int day, List<OverWeightMaleDto> workout) {
		super();
		this.day = day;
		this.workout = workout;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public List<OverWeightMaleDto> getWorkout() {
		return workout;
	}

	public void setWorkout(List<OverWeightMaleDto> workout) {
		this.workout = workout;
	}

}

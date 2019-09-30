package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.OverWeightFemaleDto;

public class ResponseModel {

	private int day;
	List<OverWeightFemaleDto> workout;

	public ResponseModel() {
		super();
	}

	public ResponseModel(int day, List<OverWeightFemaleDto> workout) {
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

	public List<OverWeightFemaleDto> getWorkout() {
		return workout;
	}

	public void setWorkout(List<OverWeightFemaleDto> workout) {
		this.workout = workout;
	}

}

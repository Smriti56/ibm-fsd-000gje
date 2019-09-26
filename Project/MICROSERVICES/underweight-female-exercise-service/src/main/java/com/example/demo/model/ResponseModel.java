package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.UnderWeightFemaleDto;

public class ResponseModel {

	private int day;
	List<UnderWeightFemaleDto> workout;

	public ResponseModel() {
		super();
	}

	public ResponseModel(int day, List<UnderWeightFemaleDto> workout) {
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

	public List<UnderWeightFemaleDto> getWorkout() {
		return workout;
	}

	public void setWorkout(List<UnderWeightFemaleDto> workout) {
		this.workout = workout;
	}

}

package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.UnderWeightMaleDto;

public class ResponseModel {

	private int day;
	List<UnderWeightMaleDto> workout;

	public ResponseModel() {
		super();
	}

	public ResponseModel(int day, List<UnderWeightMaleDto> workout) {
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

	public List<UnderWeightMaleDto> getWorkout() {
		return workout;
	}

	public void setWorkout(List<UnderWeightMaleDto> workout) {
		this.workout = workout;
	}

}

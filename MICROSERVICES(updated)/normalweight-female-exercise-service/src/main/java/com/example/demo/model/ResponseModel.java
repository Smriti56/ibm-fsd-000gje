package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.NormalWeightFemaleDto;

public class ResponseModel {

	private int day;
	List<NormalWeightFemaleDto> workout;

	public ResponseModel() {
		super();
	}

	public ResponseModel(int day, List<NormalWeightFemaleDto> workout) {
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

	public List<NormalWeightFemaleDto> getWorkout() {
		return workout;
	}

	public void setWorkout(List<NormalWeightFemaleDto> workout) {
		this.workout = workout;
	}

}

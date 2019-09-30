package com.example.demo.dto;

public class UnderWeightMaleDto {
	private String exerciseName;
	private String exerciseDescription;
	private int amount;
	private String exerciseUrl;

	public UnderWeightMaleDto() {
		super();
	}

	public UnderWeightMaleDto( String exerciseName, String exerciseDescription, int amount, String exerciseUrl) {
		super();

		this.exerciseName = exerciseName;
		this.exerciseDescription = exerciseDescription;
		this.amount = amount;
		this.exerciseUrl = exerciseUrl;
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

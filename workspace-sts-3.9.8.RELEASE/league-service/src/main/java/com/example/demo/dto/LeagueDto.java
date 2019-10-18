package com.example.demo.dto;



public class LeagueDto {
	
private int id;
	
	private String name;
	private String season;
	private String year;
	
	public LeagueDto() {
		super();
	}
	public LeagueDto(int id, String name, String season, String year) {
		super();
		this.id = id;
		this.name = name;
		this.season = season;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
}

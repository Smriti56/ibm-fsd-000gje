package com.Spring.spring_demo.model;

import org.springframework.stereotype.Component;

@Component("theBadmintonCoach") 
public class BadmintonCoach implements Coach{

	private String coachName;
	private int teamNo;
	
	public String getDailyWorkout() {
	
		return "Jog for 10 minutes";
	}

	public String getDailyFortune() {
		
		return "Good luck";
	}

}

package com.Spring.spring_demo.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

	@Value("Shresth")
	private String coachName;
	@Value("10")
	private int teamno;
	
	FortuneService service;
	
	public SwimCoach()
	{
	}
	
	@Autowired
	public SwimCoach( FortuneService service) {
//		this.coachName = coachName;
//		this.teamno = teamno;
		this.service = service;
	}

	
	

	public String getCoachNAme() {
		return coachName;
	}


	public void setCoachNAme(String coachNAme) {
		this.coachName = coachNAme;
	}


	public int getTeamno() {
		return teamno;
	}


	public void setTeamno(int teamno) {
		this.teamno = teamno;
	}


	public FortuneService getService() {
		return service;
	}


	public void setService(FortuneService service) {
		this.service = service;
	}


	public String getDailyWorkout() {
		return "do backStroke";
		}

	public String getDailyFortune() {
		return service.getDailyFortuneService();
	}

	@PostConstruct
	public void getWaterLevel()
	{
		System.out.println("Water level is OK");
	}
	
	@PreDestroy
	public void beforeDestryoy()
	{
		System.out.println("Everything done");
	}
	
}

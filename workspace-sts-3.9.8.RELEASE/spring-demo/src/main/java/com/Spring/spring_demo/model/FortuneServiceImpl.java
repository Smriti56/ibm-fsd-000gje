package com.Spring.spring_demo.model;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService{

	public String getDailyFortuneService() {
		return "Today is a happy day";
	}

}

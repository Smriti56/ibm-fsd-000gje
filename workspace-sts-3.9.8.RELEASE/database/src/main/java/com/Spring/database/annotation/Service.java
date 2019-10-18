package com.Spring.database.annotation;

import org.springframework.stereotype.Component;

@Component(value = "service")
public class Service {

	public void msg()
	{
		System.out.println("Good Morning");
	}
}

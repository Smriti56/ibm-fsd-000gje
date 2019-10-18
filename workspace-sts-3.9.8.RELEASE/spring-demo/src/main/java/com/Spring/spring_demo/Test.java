package com.Spring.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.spring_demo.model.SwimCoach;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext2.xml");
		SwimCoach sc= context.getBean(SwimCoach.class);
		System.out.println(sc.getDailyFortune());
		context.destroy();
		
	}
}

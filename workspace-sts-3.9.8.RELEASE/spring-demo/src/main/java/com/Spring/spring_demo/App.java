package com.Spring.spring_demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.spring_demo.model.BadmintonCoach;
import com.Spring.spring_demo.model.Coach;
import com.Spring.spring_demo.model.Employee;

public class App 
{
	 public static void main( String[] args )
	    {
//	        try {
//	        	
//	        	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//	        	Employee emp=context.getBean("theEmployee",Employee.class);
//	        	System.out.println(emp.toString());
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		 
		 ApplicationContext context =new ClassPathXmlApplicationContext("newContext.xml");
		 Coach c= (BadmintonCoach) context.getBean("theBadmintonCoach");
		 System.out.println(c.getDailyFortune());
		 
		 
	    }
}

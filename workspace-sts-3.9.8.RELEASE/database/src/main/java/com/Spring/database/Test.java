package com.Spring.database;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.database.annotation.EmpDao;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
		
		EmpDao em= context.getBean("empdao", EmpDao.class);
		em.callFunc();
		context.close();
		
	}
}

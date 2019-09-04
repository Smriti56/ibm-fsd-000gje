package com.ibm.fsd.mycoolapp;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.hibernate.SessionFactory;

public class Tester {
	
	public static void main(String[] args) {
		org.hibernate.SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session =factory.openSession();
//		Employee emp=new Employee("Kinjal","k@g.com","1234","uk");
//		session.getTransaction().begin();
//		session.persist(emp);
//		System.out.println("inserted");
		
		
		Query query= session.createQuery("from Employee");
		List<Employee> list= query.getResultList();
		for(Employee e:list)
		{
			System.out.println(e);
		}
		//session.getTransaction().commit();	
		
		
		}

}

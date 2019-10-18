package com.Spring.database;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.database.db.Empl;
import com.Spring.database.db.EmplDao;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("appCont.xml");
		EmplDao emp= cont.getBean("emp",EmplDao.class);
		//Empl em=cont.getBean("empl",Empl.class);
		emp.createEmployee(new Empl("Kinjal"));
		List<Empl> emplist=emp.getAllEmployee();
		
		for(Empl e:emplist)
		{
			System.out.println(e.toString());
		}
		
		
	}

}

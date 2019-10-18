package com.Spring.withoutXML.db;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Spring.withoutXML.db.entity.EmpConfig;
import com.Spring.withoutXML.db.entity.Employee;
import com.Spring.withoutXML.db.entity.EmployeeDao;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmpConfig.class);
		EmployeeDao emp=context.getBean("emp",EmployeeDao.class);
		//Employee e=context.getBean("emp",Employee.class);
		emp.createEmployee(new Employee("John"));
		

	}

}

package com.Spring.database;

import java.sql.SQLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.database.bean.Employee;
import com.Spring.database.bean.EmployeeDao;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        
        EmployeeDao e= factory.getBean(EmployeeDao.class);
        e.createEmployee(new Employee("Rohan"));
    }
}

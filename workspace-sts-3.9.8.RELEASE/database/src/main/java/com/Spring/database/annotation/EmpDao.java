package com.Spring.database.annotation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component(value="empdao")
public class EmpDao {
	

	@Autowired
	private Service service;
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void callFunc()
	{
		service.msg();
	}
	
	public void createEmployee(Emp emp)
	{
		
	}
	
	
	@PostConstruct
	public void initialise()
	{
		System.out.println("After initialisation");
	}
	
	@PreDestroy
	public void  end()
	{
		System.out.println("Before destroy");
	}
}

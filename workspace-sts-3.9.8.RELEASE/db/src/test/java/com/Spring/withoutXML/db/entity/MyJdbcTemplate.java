package com.Spring.withoutXML.db.entity;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("jdbctemp")
public class MyJdbcTemplate extends JdbcTemplate
{
	@Autowired
	private MyDataSource dataSource;
	
	@PostConstruct
	public void setter() {
		setDataSource(dataSource);
	}
	
	
}

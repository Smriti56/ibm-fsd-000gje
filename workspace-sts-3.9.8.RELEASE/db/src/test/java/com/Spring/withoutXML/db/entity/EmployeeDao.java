package com.Spring.withoutXML.db.entity;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component("emp")
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbctemp;
	

	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}



	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}



	public void createEmployee(Employee employee) throws SQLException
	{
		String query="insert into emp(name) values(?)";
		Object obj[]= {employee.getName()};
		jdbctemp.update(query,obj);
		System.out.println("done");
	}
	
	public List<Employee> getAllEmployee()
	{
		return jdbctemp.query("select * from emp", new EmployeeRowMapper());
	}
}

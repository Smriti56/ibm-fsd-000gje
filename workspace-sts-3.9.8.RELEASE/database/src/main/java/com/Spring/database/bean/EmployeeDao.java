package com.Spring.database.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class EmployeeDao {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
	public void createEmployee(Employee employee) throws SQLException
	{
		Connection connection= dataSource.getConnection();
		PreparedStatement pst =connection.prepareStatement("insert into emp(name) values(?)");
		pst.setString(1, employee.getName());
		pst.executeUpdate();
		System.out.println("inserted");
		
	}
}

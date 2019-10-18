package com.Spring.database.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper {

	public Empl mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Empl employee=new Empl();
		employee.setId(rs.getInt(1));
		employee.setName(rs.getString(2));
		return employee;
	}
}

package comm.example.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setFirstName(rs.getString(2));
		student.setLastName(rs.getString(3));
		student.setCountry(rs.getString(4));
		student.setFavouriteLanguage(rs.getString(6));
		student.setOperatingSystems(rs.getString(5));
		
		System.out.println(student.getId()+" "+student.getCountry()+" "+student.getOperatingSystems());
		
		return student;
	}
}

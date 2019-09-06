package comm.example.model;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;




@Component("stud")
public class StudentDao {
	

	@Autowired
	private JdbcTemplate jdbctemp;
	

	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}



	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}



	public void createEmployee(Student stu) throws SQLException
	{
		String query="insert into Student(fname,lname,country,lang,os) values(?,?,?,?,?)";
		System.out.println(stu.getFirstName()+" "+stu.getLastName()+" "+stu.getFavouriteLanguage()+" "+stu.getCountry()+" "+Arrays.toString(stu.getOperatingSystems()));
		Object obj[]= {stu.getFirstName(),stu.getLastName(),stu.getCountry(),stu.getFavouriteLanguage(),Arrays.toString(stu.getOperatingSystems())};
		jdbctemp.update(query,obj);
		System.out.println("done");
	}
	
	public List<Student> getAllEmployee()
	{
		return jdbctemp.query("select * from Student", new StudentRowMapper());
	}



	public void deleteStudent(int id) {
		Object[] obj= {id};
		String query="delete from Student where id=?";
		jdbctemp.update(query,obj);
		System.out.println("deleted");
	}



	public List<Student> searchEmployee(String type,String value) {
		
		System.out.println(type+" "+value);
		if(value=="firstName")
		{
			return jdbctemp.query("select * Student where fname= "+type, new StudentRowMapper());
		}
		else
		{
		return jdbctemp.query("select * student where lname="+type, new StudentRowMapper());
	}
		
		
		
	}
	

}

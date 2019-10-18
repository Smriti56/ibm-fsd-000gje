package comm.example.model;

import java.sql.Connection;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;
@Component("dataSource")
public class MyDataSource extends BasicDataSource
{
	@PostConstruct
	public void setter() {
		this.setUrl("jdbc:mysql://localhost:3306/hr");
		this.setUsername("root");
		this.setPassword("root");
		
	}
	
}

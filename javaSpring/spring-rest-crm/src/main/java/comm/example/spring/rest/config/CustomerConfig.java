package comm.example.spring.rest.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "comm.example.spring.rest")
public class CustomerConfig implements WebMvcConfigurer  {
	
	@Bean
	public DataSource MyDataSource()
	{
		ComboPooledDataSource myDataSource = new ComboPooledDataSource();
		myDataSource.setUser("root");
		myDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hr");
		try {
			myDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		} catch (PropertyVetoException e) {
			
			e.printStackTrace();
		}
		myDataSource.setPassword("root");
		myDataSource.setMinPoolSize(10);
		myDataSource.setMaxPoolSize(20);
		myDataSource.setMaxIdleTimeExcessConnections(30000);
		
		return myDataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(MyDataSource());
		sessionFactory.setHibernateProperties(getProperties());
		sessionFactory.setPackagesToScan("comm.example.spring.rest");
		return sessionFactory;
		
	}

	private Properties getProperties() {
		Properties props =new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.put("hibernate.show_sql", "true");
		return props;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager myTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager txManager= new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}

}

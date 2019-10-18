package comm.example.Spring.dao;



import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.example.Spring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	private Session session;

	
	public CustomerDAOImpl() {
		super();
	}



	public CustomerDAOImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}



	public void createCustomer(Customer customer) {
		session=sessionfactory.getCurrentSession();
		session.save(customer);
	}
	
	
	public List<Customer> getCustomers() {
		
		session=sessionfactory.getCurrentSession();
		Query<Customer> theQuery = session.createQuery("from Customer order by lastName", Customer.class);
		List<Customer> customers= theQuery.getResultList();
		return customers;
	}



	public void deleteCustomer(Customer customer) {
		session=sessionfactory.getCurrentSession();
		session.delete(customer);
		
	}



	public Customer getCustomerById(int id) {
		
		session=sessionfactory.getCurrentSession();
		Customer customer=session.get(Customer.class,id);
		return customer;
		
	}
	
	@Transactional
	public void editCustomer(Customer customer) {
		session=sessionfactory.getCurrentSession();
		//System.out.println(customer.getEmail());
		//System.out.println(customer.getId());
		session.merge(customer);
		//Query query=session.createQuery("Update Customer set firstName='"+customer.getFirstName()+"',lastName='"+customer.getLastName()+"',email='"+customer.getEmail()+"' where id ="+customer.getId());
		//query.executeUpdate();
	}



	@Override
	public List<Customer> getCustomer(String type, String value) {
		session=sessionfactory.openSession();
		Query<Customer> query=session.createQuery("from Customer where "+type+" like '%"+value+"%'",Customer.class);
		List<Customer> customers= query.getResultList();
		return customers;
	}



	

}

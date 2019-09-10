package comm.example.spring.rest.dao;

import java.util.List;
import comm.example.spring.rest.Customer;


public interface CustomerDAO {
	
	public void createCustomer(Customer customer);
	public List<Customer> getCustomers();
	public void deleteCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void editCustomer(Customer customer);
	public List<Customer> getCustomer(String type,String value);

}

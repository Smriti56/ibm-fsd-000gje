package comm.example.Spring.dao;

import java.util.List;

import comm.example.Spring.entity.Customer;

public interface CustomerDAO {
	
	public void createCustomer(Customer customer);
	public List<Customer> getCustomers();
	public void deleteCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void editCustomer(Customer customer);
	public List<Customer> getCustomer(String type,String value);

}

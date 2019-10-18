package comm.example.Spring.service;

import java.util.List;

import comm.example.Spring.entity.Customer;

public interface CustomerService {

	public void createCustomer(Customer customer);
	public List<Customer> getCustomers();
	public void deleteCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void editCustomer(Customer customer);
	public List<Customer> getCustomer(String type,String value);
}

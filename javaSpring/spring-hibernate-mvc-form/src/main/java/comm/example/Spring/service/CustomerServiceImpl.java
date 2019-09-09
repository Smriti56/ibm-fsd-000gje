package comm.example.Spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import comm.example.Spring.dao.CustomerDAO;
import comm.example.Spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerdao;


	@Transactional
	public void createCustomer(Customer customer) {
		customerdao.createCustomer(customer);
		
	}

	@Transactional
	public List<Customer> getCustomers() {
		List<Customer> customers=customerdao.getCustomers();
		return customers;
		
	}

	@Transactional
	public void deleteCustomer(Customer customer) {
		customerdao.deleteCustomer(customer);
		
	}

	@Transactional
	public Customer getCustomerById(int id) {
		return customerdao.getCustomerById(id);
	}

	@Transactional
	public void editCustomer(Customer customer) {
		customerdao.editCustomer(customer);
		
	}

	@Override
	public List<Customer> getCustomer(String type, String value) {
		return customerdao.getCustomer(type, value);
	}


	

}

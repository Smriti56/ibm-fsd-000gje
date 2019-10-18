package comm.example.spring.rest.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.spring.rest.Customer;
import comm.example.spring.rest.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService service;

	@GetMapping("/customers")
	public List<Customer> getAllCustomer()
	{
		return service.getCustomers();
		
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
	
		customer.setId(0);
		service.createCustomer(customer);
		return customer;
	}
	
	@DeleteMapping("/customers/{id}") 
	public Customer deleteCustomer(@PathVariable int id) {
		Customer customer=service.getCustomerById(id);
		service.deleteCustomer(customer);
		return customer;
	}
	
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		service.editCustomer(customer);
		return customer;
	}
	
	

}

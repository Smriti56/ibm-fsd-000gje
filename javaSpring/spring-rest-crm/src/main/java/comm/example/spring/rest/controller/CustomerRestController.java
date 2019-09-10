package comm.example.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}

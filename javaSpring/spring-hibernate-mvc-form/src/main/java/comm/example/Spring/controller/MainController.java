package comm.example.Spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comm.example.Spring.entity.Customer;
import comm.example.Spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class MainController {
	

	
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("/list")
	public String homePage(Model model) {
		List<Customer> theCustomers = customerservice.getCustomers();
		model.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@RequestMapping("/form")
	public String form(Model model) {
		Customer customer= new Customer();
		model.addAttribute("customer",customer);
		return "main";
	}
	
	
	
	@PostMapping("/processform")
	public String add(@ModelAttribute("customer") Customer customer){
		customerservice.createCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		Customer cust=customerservice.getCustomerById(id);
		customerservice.deleteCustomer(cust);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model tmodel){
		Customer customer= customerservice.getCustomerById(id);
		System.out.println(customer.getId());
		tmodel.addAttribute("customer", customer);
		return "editform";
	}
	
	@PostMapping("/edit/saveNew")
	public String save(@ModelAttribute("customer") Customer customer){
		System.out.println(customer.getId());
		customerservice.editCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/Find")
	public String search(HttpServletRequest request,Model model)
	{
		String type=request.getParameter("type");
		String value=request.getParameter("value");
		System.out.println(type+" "+value);
		List<Customer> customerList=customerservice.getCustomer(type, value);
		System.out.println(customerList);
		model.addAttribute("customer",customerList);
		return "customers";
		
	}

}

package comm.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	
		@GetMapping("/")
		public String showHome() {
			
			return "home";
		}
		
		@RequestMapping("/showMyLoginPage")
		public String myPage()
		{
			return "my-page";
		}
}

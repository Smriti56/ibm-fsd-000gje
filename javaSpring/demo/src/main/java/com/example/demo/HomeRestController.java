package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@RequestMapping("/")
	public String getHome()
	{

		return "welcome to spring boot! its break time";
	}
}

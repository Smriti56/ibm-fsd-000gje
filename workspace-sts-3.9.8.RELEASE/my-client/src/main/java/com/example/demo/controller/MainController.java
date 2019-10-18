package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

	@Autowired
	private Environment env;
	@Value("${lucky-word}")
	private String luckyWord;
	private static final Logger logger=LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/lucky-word")
	public String lucky()
	{
		logger.info("config read from server . running client at port no"+ env.getProperty("local.server.port"));
		return luckyWord;
	}
}

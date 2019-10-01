package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Mobile;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@RestController
@CrossOrigin
public class MainController {
	
	public static final String ACCOUNT_SID = "ACba7bdcbdc4701d211fc336095f74a11f";
	  public static final String AUTH_TOKEN = "1117e7c2b04abb40649d230355dbe51c";
	
	
	
	
	@PostMapping("/sendMsg")
	public ResponseEntity<?> createUser(@RequestBody Mobile m) {
		
		String mno="+91"+m.getPhoneNo();
		System.out.println(mno);
		
		   Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		   
		    Message message = Message.creator(new PhoneNumber(mno),
		        new PhoneNumber("+16146827041"), 
		        "Welcome to Fitness Tracker").create();

		    System.out.println(message.getSid());
		    return ResponseEntity.status(HttpStatus.CREATED).body(message.getSid());
		
		
	}
	
}

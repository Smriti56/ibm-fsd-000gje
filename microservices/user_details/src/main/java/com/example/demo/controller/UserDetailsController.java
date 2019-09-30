package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserDetails;
import com.example.demo.service.UserDetailService;


@RestController
@CrossOrigin
public class UserDetailsController {
	
	@Autowired
	UserDetailService userDetailService;
	
	
	@PostMapping("/saveDetails")
	public ResponseEntity<?> createUser(@RequestBody UserDetails ud) {
		UserDetails udetails = userDetailService.saveDetails(ud);
		 return ResponseEntity.status(HttpStatus.CREATED).body(udetails);
		
	}
	
	@GetMapping("/getDetails")
	public ResponseEntity<?> getUser(@RequestBody UserDetails ud) {
		System.out.println(ud.getEmail());
		List<UserDetails> udetails =userDetailService.getUserDetailsbyEmail(ud.getEmail());
		 return ResponseEntity.status(HttpStatus.CREATED).body(udetails);
		
	}


}

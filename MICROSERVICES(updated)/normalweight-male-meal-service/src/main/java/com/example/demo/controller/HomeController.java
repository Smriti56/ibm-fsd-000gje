package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.NormalWeightService;

@RestController
public class HomeController {

	@Autowired
	NormalWeightService overWeightService;
	
	@GetMapping("/meal")
	public ResponseEntity<?> getMeal(){
		return ResponseEntity.ok(overWeightService.getMeal());
	}
}

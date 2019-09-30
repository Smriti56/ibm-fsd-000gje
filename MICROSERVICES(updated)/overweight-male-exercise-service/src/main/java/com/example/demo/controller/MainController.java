package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.OverWeightMale;
import com.example.demo.service.OverWeightService;

@RestController
public class MainController {

	@Autowired
	OverWeightService overWeightService;
	
	@GetMapping("/workout")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(overWeightService.getWorkout());
	}
	
	@PostMapping("/workout")
	public ResponseEntity<?> postWorkout(@RequestBody OverWeightMale male){
		return ResponseEntity.ok(overWeightService.addworkout(male));
	}
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	ProductServiceClient productServiceClient;
	
	@RequestMapping("/fetchProducts")
	public ResponseEntity<?> products()
	{
		return ResponseEntity.ok(productServiceClient.getAllProducts());
	}
	
	
	@RequestMapping("/fetchProduct/{id}")
	public ResponseEntity<?> product(@PathVariable int id)
	{
		return ResponseEntity.ok(productServiceClient.getProductById(id));
	}
	

}

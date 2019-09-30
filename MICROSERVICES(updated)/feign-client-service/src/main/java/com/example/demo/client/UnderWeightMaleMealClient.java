package com.example.demo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "underweight-male-meal-service")
public interface UnderWeightMaleMealClient {

	@GetMapping("/meal")
	public ResponseEntity<?> getMeal();
}

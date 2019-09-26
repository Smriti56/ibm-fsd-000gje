package com.example.demo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "overweight-male-meal-service")
public interface OverWeightMaleMealClient {

	@GetMapping("/meal")
	public ResponseEntity<?> getMeal();
}

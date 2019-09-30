package com.example.demo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "overweight-female-meal-service")
public interface OverWeightFemaleMealClient {

	@GetMapping("/meal")
	public ResponseEntity<?> getMeal();
}

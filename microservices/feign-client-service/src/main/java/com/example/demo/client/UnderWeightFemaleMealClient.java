package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "underweight-female-meal-service")
public interface UnderWeightFemaleMealClient {

	@GetMapping("/meal")
	public ResponseEntity<?> getMeal();
}

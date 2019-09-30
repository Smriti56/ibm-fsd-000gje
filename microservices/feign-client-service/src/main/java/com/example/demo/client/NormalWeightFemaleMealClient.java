package com.example.demo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "normalweight-female-meal-service")
public interface NormalWeightFemaleMealClient {

	@GetMapping("/meal")
	public ResponseEntity<?> getMeal();
}

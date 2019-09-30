package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "underweight-female-exercise-service")
public interface UnderWeightFemaleExerciseClient {

	@GetMapping("/workout")
	public ResponseEntity<?> getAll();
}

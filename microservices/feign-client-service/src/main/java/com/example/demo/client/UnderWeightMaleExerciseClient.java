package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "underweight-male-exercise-service")
public interface UnderWeightMaleExerciseClient {

	@GetMapping("/workout")
	public ResponseEntity<?> getAll();
}

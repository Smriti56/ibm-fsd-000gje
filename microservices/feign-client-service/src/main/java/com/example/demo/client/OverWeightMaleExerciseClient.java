package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "overweight-male-exercise-service")
public interface OverWeightMaleExerciseClient {

	@GetMapping("/workout")
	public ResponseEntity<?> getAll();
}

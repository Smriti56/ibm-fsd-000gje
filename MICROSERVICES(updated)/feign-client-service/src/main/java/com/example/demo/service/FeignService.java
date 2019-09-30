package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.client.NormalWeightFemaleExerciseClient;
import com.example.demo.client.NormalWeightFemaleMealClient;
import com.example.demo.client.NormalWeightMaleExerciseClient;
import com.example.demo.client.NormalWeightMaleMealClient;
import com.example.demo.client.OverWeightFemaleExerciseClient;
import com.example.demo.client.OverWeightFemaleMealClient;
import com.example.demo.client.OverWeightMaleExerciseClient;
import com.example.demo.client.OverWeightMaleMealClient;
import com.example.demo.client.UnderWeightFemaleExerciseClient;
import com.example.demo.client.UnderWeightFemaleMealClient;
import com.example.demo.client.UnderWeightMaleExerciseClient;
import com.example.demo.client.UnderWeightMaleMealClient;
import com.example.demo.client.UserServiceClient;
import com.example.demo.model.UserRequest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FeignService {

	private UserServiceClient userServiceClient;

	private OverWeightFemaleExerciseClient overWeightFemaleExerciseClient;
	private OverWeightFemaleMealClient overWeightFemaleMealClient;
	private OverWeightMaleExerciseClient overWeightMaleExerciseClient;
	private OverWeightMaleMealClient overWeightMaleMealClient;

	private UnderWeightFemaleExerciseClient underWeightFemaleExerciseClient;
	private UnderWeightFemaleMealClient underWeightFemaleMealClient;
	private UnderWeightMaleExerciseClient underWeightMaleExerciseClient;
	private UnderWeightMaleMealClient underWeightMaleMealClient;

	private NormalWeightFemaleExerciseClient normalWeightFemaleExerciseClient;
	private NormalWeightFemaleMealClient normalWeightFemaleMealClient;
	private NormalWeightMaleExerciseClient normalWeightMaleExerciseClient;
	private NormalWeightMaleMealClient normalWeightMaleMealClient;

	@Autowired
	public FeignService(UserServiceClient userServiceClient,
			OverWeightFemaleExerciseClient overWeightFemaleExerciseClient,
			OverWeightFemaleMealClient overWeightFemaleMealClient,
			OverWeightMaleExerciseClient overWeightMaleExerciseClient,
			OverWeightMaleMealClient overWeightMaleMealClient,
			UnderWeightFemaleExerciseClient underWeightFemaleExerciseClient,
			UnderWeightFemaleMealClient underWeightFemaleMealClient,
			UnderWeightMaleExerciseClient underWeightMaleExerciseClient,
			UnderWeightMaleMealClient underWeightMaleMealClient,
			NormalWeightFemaleExerciseClient normalWeightFemaleExerciseClient,
			NormalWeightFemaleMealClient normalWeightFemaleMealClient,
			NormalWeightMaleExerciseClient normalWeightMaleExerciseClient,
			NormalWeightMaleMealClient normalWeightMaleMealClient) {
		super();
		this.userServiceClient = userServiceClient;
		this.overWeightFemaleExerciseClient = overWeightFemaleExerciseClient;
		this.overWeightFemaleMealClient = overWeightFemaleMealClient;
		this.overWeightMaleExerciseClient = overWeightMaleExerciseClient;
		this.overWeightMaleMealClient = overWeightMaleMealClient;
		this.underWeightFemaleExerciseClient = underWeightFemaleExerciseClient;
		this.underWeightFemaleMealClient = underWeightFemaleMealClient;
		this.underWeightMaleExerciseClient = underWeightMaleExerciseClient;
		this.underWeightMaleMealClient = underWeightMaleMealClient;
		this.normalWeightFemaleExerciseClient = normalWeightFemaleExerciseClient;
		this.normalWeightFemaleMealClient = normalWeightFemaleMealClient;
		this.normalWeightMaleExerciseClient = normalWeightMaleExerciseClient;
		this.normalWeightMaleMealClient = normalWeightMaleMealClient;
	}

	public ResponseEntity<?> createUser(UserRequest userRequest) {
		return userServiceClient.createUser(userRequest);
	}

	@HystrixCommand(fallbackMethod = "getFallbackCreateUser")
	public ResponseEntity<?> verifyUser(UserRequest userRequest) {
		return userServiceClient.verifyUser(userRequest);
	}

	public ResponseEntity<?> deleteUser(Integer id) {
		return userServiceClient.deleteUser(id);
	}

	public ResponseEntity<?> getAllUsers() {
		return userServiceClient.getAllUsers();
	}

	public ResponseEntity<?> verifyUserBycrypt(UserRequest userRequest) {
		return userServiceClient.verifyUserBycrypt(userRequest);
	}

	public ResponseEntity<?> getUserByEmail(UserRequest ur) {
		return userServiceClient.getUserByEmail(ur);
	}

	public ResponseEntity<?> sendPassword(UserRequest user) {
		return userServiceClient.sendPassword(user);
	}

	public ResponseEntity<?> updatePassword(UserRequest user) {
		return userServiceClient.updatePassword(user);
	}

	public ResponseEntity<?> getWorkout(String workout) {
		if (workout.equals("underweight_female")) {
			return underWeightFemaleExerciseClient.getAll();
		} else if (workout.equals("underweight_male")) {
			return underWeightMaleExerciseClient.getAll();
		} else if (workout.equals("overweight_female")) {
			return overWeightFemaleExerciseClient.getAll();
		} else if (workout.equals("normal_male")) {
			return normalWeightMaleExerciseClient.getAll();
		} else if (workout.equals("normal_female")) {
			return normalWeightFemaleExerciseClient.getAll();
		} else {
			return overWeightMaleExerciseClient.getAll();
		}

	}

	public ResponseEntity<?> getMeal(String workout) {
		if (workout.equals("underweight_female")) {
			return underWeightFemaleMealClient.getMeal();
		} else if (workout.equals("underweight_male")) {
			return underWeightMaleMealClient.getMeal();
		} else if (workout.equals("overweight_female")) {
			return overWeightFemaleMealClient.getMeal();
		} else if (workout.equals("normal_male")) {
			return normalWeightMaleMealClient.getMeal();
		} else if (workout.equals("normal_female")) {
			return normalWeightFemaleMealClient.getMeal();
		} else {
			return overWeightMaleMealClient.getMeal();
		}

	}

	public ResponseEntity<?> getFallbackCreateUser(UserRequest userRequest) {
		return ResponseEntity.status(HttpStatus.CREATED).body(new Error("ERROR 404: server unavaible"));
	}

	public ResponseEntity<?> verifyUserGmail(UserRequest userRequest) {
		return userServiceClient.verifyUserGmail(userRequest);
	}

}

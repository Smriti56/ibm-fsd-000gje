package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.UserRequest;

@FeignClient(name = "user-service")
public interface UserServiceClient {
	
	@PostMapping("/addUser")
	public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest);
	
	@RequestMapping("/loginbyBcrypt")
	public ResponseEntity<?> verifyUserBycrypt(@RequestBody UserRequest userRequest);
	
	@RequestMapping("/login")
	public ResponseEntity<?> verifyUser(@RequestBody UserRequest userRequest);
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id);
	
	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers();
	
	@PostMapping("/search")
	public ResponseEntity<?> getUserByEmail(@RequestBody UserRequest ur);
	
	@PostMapping("/password")
	public ResponseEntity<?> sendPassword(@RequestBody UserRequest user);
	
	@PostMapping("/updatePassword")
	public ResponseEntity<?> updatePassword(@RequestBody UserRequest user);
	
    @PostMapping("/loginWithGmail")
	public ResponseEntity<?> verifyUserGmail(UserRequest userRequest);

}

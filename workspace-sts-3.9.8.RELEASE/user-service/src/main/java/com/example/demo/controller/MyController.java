package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/")
public class MyController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/save")
	public ResponseEntity<CreateUserResponseModel> save(@RequestBody CreateUserRequestModel userDetails)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto user=mapper.map(userDetails, UserDto.class);
		UserDto userResponse= userService.createUser(user);
		CreateUserResponseModel response=mapper.map(userResponse, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CreateUserResponseModel>> getAll()
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<UserDto> userResponse= userService.getAllUser();
		List<CreateUserResponseModel> userList = null;
		for(UserDto e:userResponse)
		{
			CreateUserResponseModel response=mapper.map(userResponse, CreateUserResponseModel.class);
			userList.add(response);
			
		}
		
		return ResponseEntity.status(HttpStatus.FOUND).body(userList);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<CreateUserResponseModel> findById(@PathVariable int id)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userResponse= userService.findById(id);
		CreateUserResponseModel response=mapper.map(userResponse, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

}

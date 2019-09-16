package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserEntityRepository;

public interface UserService {
	
	public UserDto createUser(UserDto userDetails);

}

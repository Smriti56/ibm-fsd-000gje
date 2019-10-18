package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserEntityRepository;

public interface UserService {
	
	public UserDto createUser(UserDto userDetails);

	public List<UserDto> getAllUser();

	public UserDto findById(int id);

}

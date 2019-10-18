package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;


public interface UserService {

	public UserDto createUser(UserDto user);
	public List<UserDto> getAllUsers();
	public UserDto getUserById(int id);
	public void deleteUser(int id);
	public UserDto updateUser(UserDto user);
	public UserDto getUserByEmail(String email);
	public UserDto verifyUser(UserDto userdto);
}

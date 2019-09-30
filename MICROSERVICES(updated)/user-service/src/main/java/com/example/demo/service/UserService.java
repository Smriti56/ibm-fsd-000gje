package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.model.UserResponse;


public interface UserService {

	public UserDto createUser(UserDto user);
	public List<UserResponse> getAllUsers();
	public UserDto getUserById(int id);
	public void deleteUser(int id);
	public UserDto updateUser(UserDto user);
	public UserDto getUserByEmail(String email);
	public UserDto verifyUser(UserDto userdto);
	User sendPassword(UserDto userDto);
	UserDto updatePassword(UserDto userDto);
	UserDto verifyUserbyBcrypt(UserDto userdto);
	public UserDto verifyUserGmail(UserDto userdto);
}

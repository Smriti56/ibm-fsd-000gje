package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserDetails;

public interface UserDetailService {
	public UserDetails saveDetails (UserDetails ud);
	public List<UserDetails> getUserDetailsbyEmail(String email);

}

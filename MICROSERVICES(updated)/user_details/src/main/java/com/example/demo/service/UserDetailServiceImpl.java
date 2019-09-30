package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserDetailsRepository;


@Service
public class UserDetailServiceImpl implements UserDetailService{

	private Environment env;
	UserDetailsRepository userDetailsRepository;
	
	
	
	@Autowired
	public UserDetailServiceImpl(Environment env, UserDetailsRepository userDetailsRepository) {
		super();
		this.env = env;
		this.userDetailsRepository = userDetailsRepository;
	}

	@Override
	public UserDetails saveDetails(UserDetails ud) {
		userDetailsRepository.save(ud);
		return ud;
	}

	@Override
	public List<UserDetails> getUserDetailsbyEmail(String email) {
		System.out.println("entering");
		List<UserDetails> ud= userDetailsRepository.findAllByEmail(email);
		
		return ud;
	}

}

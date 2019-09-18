package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.LeagueDto;


public interface LeagueService {
	
	public LeagueDto createUser(LeagueDto userDetails);

	public List<LeagueDto> getAllUser();

	public LeagueDto findById(int id);

}

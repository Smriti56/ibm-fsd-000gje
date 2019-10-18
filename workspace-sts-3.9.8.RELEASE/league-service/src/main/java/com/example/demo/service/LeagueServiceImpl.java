package com.example.demo.service;


import java.util.List;


import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LeagueDto;

import com.example.demo.entity.League;

import com.example.demo.repository.LeagueRepository;

@Service
public class LeagueServiceImpl implements LeagueService {

	
	private LeagueRepository leagueRepository;
	
	
	@Autowired
	public LeagueServiceImpl(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}




	@Override
	public LeagueDto createUser(LeagueDto userDetails) {
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		League entity=mapper.map(userDetails, League.class);
		LeagueDto entitydto=mapper.map(entity, LeagueDto.class);
		leagueRepository.save(entity);
		return entitydto;
	}



	


	@Override
	public List<LeagueDto> getAllUser() {
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<League> entity=leagueRepository.findAll();
		List<LeagueDto> entitydto=(List<LeagueDto>) mapper.map(entity, LeagueDto.class);
		return entitydto;
	}



	@Override
	public LeagueDto findById(int id) {
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		League result=leagueRepository.findById(id).get();
		LeagueDto entitydto=mapper.map(result, LeagueDto.class);
		return entitydto;
	}
		
	
	
	

	 
}

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

import com.example.demo.dto.LeagueDto;

import com.example.demo.model.CreateLeagueRequestModel;
import com.example.demo.model.CreateLeagueResponseModel;

import com.example.demo.service.LeagueService;

@RestController
@RequestMapping("/")
public class MyController {
	
	@Autowired
	private LeagueService leagueService;
	
	
	@PostMapping("/save")
	public ResponseEntity<CreateLeagueResponseModel> save(@RequestBody CreateLeagueRequestModel userDetails)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		LeagueDto user=mapper.map(userDetails, LeagueDto.class);
		LeagueDto userResponse= leagueService.createUser(user);
		CreateLeagueResponseModel response=mapper.map(userResponse, CreateLeagueResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CreateLeagueResponseModel>> getAll()
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<LeagueDto> userResponse= leagueService.getAllUser();
		List<CreateLeagueResponseModel> userList = null;
		for(LeagueDto e:userResponse)
		{
			CreateLeagueResponseModel response=mapper.map(userResponse, CreateLeagueResponseModel.class);
			userList.add(response);
			
		}
		
		return ResponseEntity.status(HttpStatus.FOUND).body(userList);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<CreateLeagueResponseModel> findById(@PathVariable int id)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		LeagueDto userResponse= leagueService.findById(id);
		CreateLeagueResponseModel response=mapper.map(userResponse, CreateLeagueResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserEntityRepository;
@Service
public class UserServiceImpl implements UserService {

	
	private UserEntityRepository userEntityRepository;
	
	
	@Autowired
	public UserServiceImpl(UserEntityRepository userEntityRepository) {
		super();
		this.userEntityRepository = userEntityRepository;
	}



	@Override
	public UserDto createUser(UserDto userDetails) {
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity entity=mapper.map(userDetails, UserEntity.class);
		UserDto entitydto=mapper.map(entity, UserDto.class);
		userEntityRepository.save(entity);
		return entitydto;
	}



	@Override
	public List<UserDto> getAllUser() {
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<UserEntity> entity=userEntityRepository.findAll();
		List<UserDto> entitydto=(List<UserDto>) mapper.map(entity, UserDto.class);
		return entitydto;
	}



	@Override
	public UserDto findById(int id) {
		ModelMapper mapper= new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity result=userEntityRepository.findById(id).get();
		UserDto entitydto=mapper.map(result, UserDto.class);
		return entitydto;
	}
		
	
	
	

	 
}

package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OverWeightMaleDto;
import com.example.demo.entity.OverWeightMale;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.OverWeightMaleRepository;

@Service
public class OverWeightImpl implements OverWeightService {
	
	@Autowired
	private OverWeightMaleRepository overWeightMaleRepository;

	@Override
	public List<ResponseModel> getWorkout() {
		List<ResponseModel> list = new ArrayList<ResponseModel>();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=1 ; i<=30;i++) {
			ResponseModel rs = new ResponseModel();
			rs.setDay(i);
			List<OverWeightMale> list1 = overWeightMaleRepository.findAllByDay(i);
			List<OverWeightMaleDto> list2 = new ArrayList<OverWeightMaleDto>();
			for(OverWeightMale male : list1) {
				list2.add(mapper.map(male, OverWeightMaleDto.class));
			}
			rs.setWorkout(list2);
			list.add(rs);
		}
		return list;
	}
	
	@Override
	public OverWeightMale addworkout(OverWeightMale male) {
		overWeightMaleRepository.save(male);
		return male;
		
	}

}

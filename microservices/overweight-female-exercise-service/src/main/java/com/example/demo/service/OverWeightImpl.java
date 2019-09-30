package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OverWeightFemaleDto;
import com.example.demo.entity.OverWeightFemale;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.OverWeightFemaleRepository;

@Service
public class OverWeightImpl implements OverWeightService {
	
	@Autowired
	private OverWeightFemaleRepository overWeightFemaleRepository;

	@Override
	public List<ResponseModel> getWorkout() {
		List<ResponseModel> list = new ArrayList<ResponseModel>();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=1 ; i<=30;i++) {
			ResponseModel rs = new ResponseModel();
			rs.setDay(i);
			List<OverWeightFemale> list1 = overWeightFemaleRepository.findAllByDay(i);
			List<OverWeightFemaleDto> list2 = new ArrayList<OverWeightFemaleDto>();
			for(OverWeightFemale female : list1) {
				list2.add(mapper.map(female, OverWeightFemaleDto.class));
			}
			rs.setWorkout(list2);
			list.add(rs);
		}
		return list;
	}
	
	@Override
	public OverWeightFemale addworkout(OverWeightFemale female) {
		overWeightFemaleRepository.save(female);
		return female;
		
	}

}

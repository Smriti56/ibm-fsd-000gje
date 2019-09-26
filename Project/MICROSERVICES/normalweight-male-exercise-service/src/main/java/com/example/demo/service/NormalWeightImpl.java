package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.NormalWeightMaleDto;
import com.example.demo.entity.NormalWeightMale;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.NormalWeightMaleRepository;

@Service
public class NormalWeightImpl implements NormalWeightService {
	
	@Autowired
	private NormalWeightMaleRepository overWeightFemaleRepository;

	@Override
	public List<ResponseModel> getWorkout() {
		List<ResponseModel> list = new ArrayList<ResponseModel>();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=1 ; i<=30;i++) {
			ResponseModel rs = new ResponseModel();
			rs.setDay(i);
			List<NormalWeightMale> list1 = overWeightFemaleRepository.findAllByDay(i);
			List<NormalWeightMaleDto> list2 = new ArrayList<NormalWeightMaleDto>();
			for(NormalWeightMale female : list1) {
				list2.add(mapper.map(female, NormalWeightMaleDto.class));
			}
			rs.setWorkout(list2);
			list.add(rs);
		}
		return list;
	}
	
	@Override
	public NormalWeightMale addworkout(NormalWeightMale female) {
		overWeightFemaleRepository.save(female);
		return female;
		
	}

}

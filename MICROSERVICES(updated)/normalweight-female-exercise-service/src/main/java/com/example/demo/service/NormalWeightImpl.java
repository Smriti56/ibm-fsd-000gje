package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.NormalWeightFemaleDto;
import com.example.demo.entity.NormalWeightFemale;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.NormalWeightFemaleRepository;

@Service
public class NormalWeightImpl implements NormalWeightService {
	
	@Autowired
	private NormalWeightFemaleRepository overWeightFemaleRepository;

	@Override
	public List<ResponseModel> getWorkout() {
		List<ResponseModel> list = new ArrayList<ResponseModel>();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=1 ; i<=30;i++) {
			ResponseModel rs = new ResponseModel();
			rs.setDay(i);
			List<NormalWeightFemale> list1 = overWeightFemaleRepository.findAllByDay(i);
			List<NormalWeightFemaleDto> list2 = new ArrayList<NormalWeightFemaleDto>();
			for(NormalWeightFemale female : list1) {
				list2.add(mapper.map(female, NormalWeightFemaleDto.class));
			}
			rs.setWorkout(list2);
			list.add(rs);
		}
		return list;
	}
	
	@Override
	public NormalWeightFemale addworkout(NormalWeightFemale female) {
		overWeightFemaleRepository.save(female);
		return female;
		
	}

}

package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UnderWeightFemaleDto;
import com.example.demo.entity.UnderWeightFemale;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.UnderWeightFemaleRepository;

@Service
public class UnderWeightImpl implements UnderWeightService {
	
	@Autowired
	private UnderWeightFemaleRepository overWeightFemaleRepository;

	@Override
	public List<ResponseModel> getWorkout() {
		List<ResponseModel> list = new ArrayList<ResponseModel>();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=1 ; i<=30;i++) {
			ResponseModel rs = new ResponseModel();
			rs.setDay(i);
			List<UnderWeightFemale> list1 = overWeightFemaleRepository.findAllByDay(i);
			List<UnderWeightFemaleDto> list2 = new ArrayList<UnderWeightFemaleDto>();
			for(UnderWeightFemale female : list1) {
				list2.add(mapper.map(female, UnderWeightFemaleDto.class));
			}
			rs.setWorkout(list2);
			list.add(rs);
		}
		return list;
	}
	
	@Override
	public UnderWeightFemale addworkout(UnderWeightFemale female) {
		overWeightFemaleRepository.save(female);
		return female;
		
	}

}

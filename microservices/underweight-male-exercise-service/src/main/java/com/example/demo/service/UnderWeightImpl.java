package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UnderWeightMaleDto;
import com.example.demo.entity.UnderWeightMale;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.UnderWeightMaleRepository;

@Service
public class UnderWeightImpl implements UnderWeightService {
	
	@Autowired
	private UnderWeightMaleRepository overWeightMaleRepository;

	@Override
	public List<ResponseModel> getWorkout() {
		List<ResponseModel> list = new ArrayList<ResponseModel>();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		for(int i=1 ; i<=30;i++) {
			ResponseModel rs = new ResponseModel();
			rs.setDay(i);
			List<UnderWeightMale> list1 = overWeightMaleRepository.findAllByDay(i);
			List<UnderWeightMaleDto> list2 = new ArrayList<UnderWeightMaleDto>();
			for(UnderWeightMale male : list1) {
				list2.add(mapper.map(male, UnderWeightMaleDto.class));
			}
			rs.setWorkout(list2);
			list.add(rs);
		}
		return list;
	}
	
	@Override
	public UnderWeightMale addworkout(UnderWeightMale male) {
		overWeightMaleRepository.save(male);
		return male;
		
	}

}

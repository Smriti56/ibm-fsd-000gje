package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UnderWeightMeal;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.UnderWeightMealRepository;

@Service
public class UnderWeightServiceImpl implements UnderWeightService {

	@Autowired
	UnderWeightMealRepository overWeightMealRepository;
	
	@Override
	public List<ResponseModel> getMeal(){
		List<UnderWeightMeal> list = (List<UnderWeightMeal>) overWeightMealRepository.findAll();
		List<ResponseModel> list2 = new ArrayList<ResponseModel>();
		for(UnderWeightMeal meal : list) {
			ResponseModel rs = new ResponseModel();
			rs.setDay(meal.getId());
			String[] breakfast = meal.getBreakfast().split(";");
			rs.setBreakfast(breakfast);
			String[] lunch = meal.getLunch().split(";");
			rs.setLunch(lunch);
			String[] snack = meal.getSnack().split(";");
			rs.setSnack(snack);
			String[] dinner = meal.getDinner().split(";");
			rs.setDinner(dinner);
			list2.add(rs);
		}
		return list2;
	}
}

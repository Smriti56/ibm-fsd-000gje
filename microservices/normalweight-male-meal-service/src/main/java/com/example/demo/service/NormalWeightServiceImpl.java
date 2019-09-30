package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.NormalWeightMeal;
import com.example.demo.model.ResponseModel;
import com.example.demo.repository.NormalWeightMealRepository;

@Service
public class NormalWeightServiceImpl implements NormalWeightService {

	@Autowired
	NormalWeightMealRepository overWeightMealRepository;
	
	@Override
	public List<ResponseModel> getMeal(){
		List<NormalWeightMeal> list = (List<NormalWeightMeal>) overWeightMealRepository.findAll();
		List<ResponseModel> list2 = new ArrayList<ResponseModel>();
		for(NormalWeightMeal meal : list) {
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

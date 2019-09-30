package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OverWeightMale;
import com.example.demo.model.ResponseModel;

public interface OverWeightService {

	List<ResponseModel> getWorkout();

	OverWeightMale addworkout(OverWeightMale male);
}

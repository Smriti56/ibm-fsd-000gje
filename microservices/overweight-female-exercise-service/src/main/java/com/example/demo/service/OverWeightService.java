package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OverWeightFemale;
import com.example.demo.model.ResponseModel;

public interface OverWeightService {

	List<ResponseModel> getWorkout();

	OverWeightFemale addworkout(OverWeightFemale female);
}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.NormalWeightFemale;
import com.example.demo.model.ResponseModel;

public interface NormalWeightService {

	List<ResponseModel> getWorkout();

	NormalWeightFemale addworkout(NormalWeightFemale female);
}

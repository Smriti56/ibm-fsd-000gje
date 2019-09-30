package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.NormalWeightMale;
import com.example.demo.model.ResponseModel;

public interface NormalWeightService {

	List<ResponseModel> getWorkout();

	NormalWeightMale addworkout(NormalWeightMale female);
}

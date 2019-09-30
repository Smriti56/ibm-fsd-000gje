package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UnderWeightFemale;
import com.example.demo.model.ResponseModel;

public interface UnderWeightService {

	List<ResponseModel> getWorkout();

	UnderWeightFemale addworkout(UnderWeightFemale female);
}

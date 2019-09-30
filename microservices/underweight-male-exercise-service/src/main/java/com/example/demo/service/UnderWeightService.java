package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UnderWeightMale;
import com.example.demo.model.ResponseModel;

public interface UnderWeightService {

	List<ResponseModel> getWorkout();

	UnderWeightMale addworkout(UnderWeightMale male);
}

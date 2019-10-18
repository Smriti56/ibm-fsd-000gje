package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorServiceImpl;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorServiceImpl doctorServiceImpl;
	
	@RequestMapping("/{disease}")
	public List<Doctor> getAllDoctor(@PathVariable String disease)
	{
		List<Doctor> doctors=doctorServiceImpl.getAllDoctors(disease);
		return doctors;	
	}
}

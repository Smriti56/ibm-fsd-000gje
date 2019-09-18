package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientServiceImpl;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientServiceImpl patientServiceImpl;
	
	@RequestMapping("/{disease}")
	public List<Patient> getAllPatients(@PathVariable String disease)
	{
		List<Patient> doctors=patientServiceImpl.getAllPatients(disease);
		return doctors;	
	}
}

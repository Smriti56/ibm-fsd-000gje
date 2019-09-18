package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public List<Patient> getAllPatients(String disease) {
		
		List<Patient> doctors=patientRepository.findByDisease(disease);
		return doctors;
	}

}

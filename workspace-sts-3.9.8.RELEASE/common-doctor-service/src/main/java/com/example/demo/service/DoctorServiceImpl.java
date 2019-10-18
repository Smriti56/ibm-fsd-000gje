package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorRepository doctorRepository;
	
	@Override
	public List<Doctor> getAllDoctors(String disease) {
		
		List<Doctor> doctors=doctorRepository.findBySpeciality(disease);
		return doctors;
	}

}

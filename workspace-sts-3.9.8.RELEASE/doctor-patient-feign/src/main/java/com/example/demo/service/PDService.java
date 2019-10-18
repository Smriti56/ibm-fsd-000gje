package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PDService {

	@Autowired
	DoctorService doctorService;
	PatientService patientService;
	

	@HystrixCommand(fallbackMethod = "getFallBackPatient")
	public ResponseEntity<?> getPatients(String disease)
	{
		return ResponseEntity.ok(patientService.getAllPatients(disease));
	}
	
	@HystrixCommand(fallbackMethod = "getFallBackDoctor")
	public ResponseEntity<?> getDoctors(String disease)
	{
		return ResponseEntity.ok(doctorService.getAllDoctor(disease));
	}

	public ResponseEntity<?> getFallBackDoctor()
	{
		 return ResponseEntity.ok("No available Doctors");
	}
	
	public ResponseEntity<?> getFallBackPatient()
	{
		 return ResponseEntity.ok("No Patients for this disease");
	}
}

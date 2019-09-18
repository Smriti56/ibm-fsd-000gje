package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DoctorService;
import com.example.demo.service.PDService;
import com.example.demo.service.PatientService;

@RestController
public class MainController {


	@Autowired
	PDService service;
	

	@RequestMapping("/doctor/{disease}")
	public ResponseEntity<?> getPatients(@PathVariable String disease)
	{
		return ResponseEntity.ok(service.getPatients(disease));
	}
	
	@RequestMapping("/patient/{disease}")
	public ResponseEntity<?> getDoctors(@PathVariable String disease)
	{
		return ResponseEntity.ok(service.getDoctors(disease));
	}
}

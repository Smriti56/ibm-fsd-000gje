package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Patient;

@FeignClient(name="patient")
public interface PatientService {
	
	@RequestMapping("/{disease}")
	public List<Patient> getAllPatients(@PathVariable String disease);

}

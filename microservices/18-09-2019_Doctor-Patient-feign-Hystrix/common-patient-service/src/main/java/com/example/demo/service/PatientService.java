package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;

public interface PatientService {

	public List<Patient> getAllPatients(String disease);
}

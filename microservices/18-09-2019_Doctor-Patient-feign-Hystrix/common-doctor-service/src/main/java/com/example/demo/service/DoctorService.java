package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService {

	public List<Doctor> getAllDoctors(String disease);
}

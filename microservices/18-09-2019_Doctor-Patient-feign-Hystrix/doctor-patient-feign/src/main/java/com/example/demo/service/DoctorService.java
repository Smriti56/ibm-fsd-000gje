package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Doctor;
import com.netflix.ribbon.proxy.annotation.Hystrix;



@FeignClient(name="doctor")
public interface DoctorService {

	@RequestMapping("/{disease}")
	public List<Doctor> getAllDoctor(@PathVariable String disease);
	
}

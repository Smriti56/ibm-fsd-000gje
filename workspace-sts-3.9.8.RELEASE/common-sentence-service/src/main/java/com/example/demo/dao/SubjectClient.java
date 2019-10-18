package com.example.demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Word;

@FeignClient("SUBJECT")
public interface SubjectClient {


	@GetMapping("/")
	Word getWord();
}

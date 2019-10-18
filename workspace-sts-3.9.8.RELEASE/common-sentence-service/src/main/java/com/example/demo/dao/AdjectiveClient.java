package com.example.demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Word;

@FeignClient("ADJECTIVE")

public interface AdjectiveClient {


	@GetMapping("/")
	Word getWord();
}

package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails , Integer>{

	

	List<UserDetails> findAllByEmail(String email);

}

package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OverWeightFemale;

@Repository
public interface OverWeightFemaleRepository extends CrudRepository<OverWeightFemale, Integer> {

	List<OverWeightFemale> findAllByDay(int day);
}

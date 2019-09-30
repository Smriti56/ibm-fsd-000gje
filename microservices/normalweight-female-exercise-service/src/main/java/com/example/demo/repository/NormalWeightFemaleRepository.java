package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NormalWeightFemale;

@Repository
public interface NormalWeightFemaleRepository extends CrudRepository<NormalWeightFemale, Integer> {

	List<NormalWeightFemale> findAllByDay(int day);
}

package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UnderWeightFemale;

@Repository
public interface UnderWeightFemaleRepository extends CrudRepository<UnderWeightFemale, Integer> {

	List<UnderWeightFemale> findAllByDay(int day);
}

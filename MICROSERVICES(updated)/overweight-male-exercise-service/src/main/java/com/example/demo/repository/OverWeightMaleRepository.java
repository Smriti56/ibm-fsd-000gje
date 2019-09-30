package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OverWeightMale;

@Repository
public interface OverWeightMaleRepository extends CrudRepository<OverWeightMale, Integer> {

	List<OverWeightMale> findAllByDay(int day);
}

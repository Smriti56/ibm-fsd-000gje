package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NormalWeightMale;

@Repository
public interface NormalWeightMaleRepository extends CrudRepository<NormalWeightMale, Integer> {

	List<NormalWeightMale> findAllByDay(int day);
}

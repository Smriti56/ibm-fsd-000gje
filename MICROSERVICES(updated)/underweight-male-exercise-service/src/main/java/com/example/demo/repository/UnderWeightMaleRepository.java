package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UnderWeightMale;

@Repository
public interface UnderWeightMaleRepository extends CrudRepository<UnderWeightMale, Integer> {

	List<UnderWeightMale> findAllByDay(int day);
}

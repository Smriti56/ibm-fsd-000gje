package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UnderWeightMeal;

@Repository
public interface UnderWeightMealRepository extends CrudRepository<UnderWeightMeal, Integer>{

}

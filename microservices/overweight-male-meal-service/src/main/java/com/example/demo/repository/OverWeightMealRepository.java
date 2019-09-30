package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OverWeightMeal;

@Repository
public interface OverWeightMealRepository extends CrudRepository<OverWeightMeal, Integer>{

}

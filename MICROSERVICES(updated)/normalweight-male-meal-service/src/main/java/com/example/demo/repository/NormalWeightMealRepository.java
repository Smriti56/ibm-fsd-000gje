package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NormalWeightMeal;

@Repository
public interface NormalWeightMealRepository extends CrudRepository<NormalWeightMeal, Integer>{

}

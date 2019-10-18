package com.example.demo.controller;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Product;

@FeignClient(name="product-service")
public interface ProductServiceClient {
	
	@GetMapping(value="/products" )
	public List<Product> getAllProducts();
	
	@GetMapping(value="/product/{id}" )
	public Product getProductById(@PathVariable int id);
	
}

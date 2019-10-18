package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

@RestController
public class ProductController {

	private static List<Product> products=new ArrayList<>();
	static
	{
		products.add(new Product(1,"A man named owe",200.0));
		products.add(new Product(2,"Marble Collector",300.0));
		products.add(new Product(3,"Mocking bird",250.0));
	}
	
	@GetMapping("/products")
	public ResponseEntity<?> getProducts()
	{
		return ResponseEntity.ok(products);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<?> getProduct(@PathVariable int id)
	{
		Product product=findProduct(id);
		if(product==null)
		{
			return ResponseEntity.badRequest().body("Invalid product id");
		}
		else
		{
			return ResponseEntity.ok(product);
		}
		
	}

	private Product findProduct(int id) {
		
		return products.stream()
				.filter(user->user.getId()==id)
				.findFirst()
				.orElse(null);
	}
	
	
	
}

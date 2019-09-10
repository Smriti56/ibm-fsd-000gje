package com.Spring.spring_demo.model;

public class Address {

	private String city;
	private String state;
	
	public Address()
	{
		
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	
}

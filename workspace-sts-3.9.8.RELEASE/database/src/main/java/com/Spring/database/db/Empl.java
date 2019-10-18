package com.Spring.database.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empl")
public class Empl {

	@Value("Smriti")
	private String name;
	private int id;
	
	public Empl() {
		super();
	}
	
	public Empl(String name) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Empl [name=" + name + ", id=" + id + "]";
	}
	
}

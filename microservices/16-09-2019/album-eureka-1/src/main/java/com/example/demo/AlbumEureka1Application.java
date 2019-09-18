package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AlbumEureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(AlbumEureka1Application.class, args);
	}

}

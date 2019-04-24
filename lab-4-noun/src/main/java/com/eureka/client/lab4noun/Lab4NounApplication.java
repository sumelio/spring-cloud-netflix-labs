package com.eureka.client.lab4noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4NounApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4NounApplication.class, args);
	}

}

package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ClientB {

	@Value("${app.greeting.msg}")
	String greeting; 

	@GetMapping("/")
	public String getAppName() {
		return greeting; 
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ClientB.class, args);
	}
}

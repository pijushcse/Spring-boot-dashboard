package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientA {

	public static void main(String[] args) {
		SpringApplication.run(ClientA.class, args);
	}
}

@RestController
class RestPi {

	@Value("${app.greeting.msg}")
	String greeting;

	@GetMapping("/")
	public String getAppName() {
		return greeting;
	}
}

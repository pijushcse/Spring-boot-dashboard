package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;

@SpringBootApplication
@EnableMicroservicesDashboardServer
@EnableDiscoveryClient
public class OrdinaMicroServiceDashboardApp {

	public static void main(String[] args) {
		SpringApplication.run(OrdinaMicroServiceDashboardApp.class, args);
	}
}

package com.example.userauthenticationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserauthenticationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserauthenticationserviceApplication.class, args);
	}

}

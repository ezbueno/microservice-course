package com.ezandro.hruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HumanresourcesUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanresourcesUserApplication.class, args);
	}

}

package com.ezandro.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HumanresourcesWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanresourcesWorkerApplication.class, args);
	}

}

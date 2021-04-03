package com.ezandro.hroauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HumanresourcesOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanresourcesOauthApplication.class, args);
	}

}

package com.ezandro.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "humanresources-worker")
@EnableFeignClients
@SpringBootApplication
public class HumanresourcesPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanresourcesPayrollApplication.class, args);
	}

}

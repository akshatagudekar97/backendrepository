package com.git.Microservice_Com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroservicCompanyPerformanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicCompanyPerformanceApplication.class, args);
	}

}

package com.git.Microservice_Prod.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceProdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProdApplication.class, args);
	}

}

package com.git.Microservice_Com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroservicCompanyCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicCompanyCompanyApplication.class, args);
	}

}

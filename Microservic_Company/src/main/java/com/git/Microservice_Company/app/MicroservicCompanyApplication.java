package com.git.Microservice_Company.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroservicCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicCompanyApplication.class, args);
	}

}

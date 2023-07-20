package com.git.Microservice_client_Addmision.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClientAddmisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientAddmisionApplication.class, args);
	}

}

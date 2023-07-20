package com.git.Microservice_client_Exam.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClientExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientExamApplication.class, args);
	}

}

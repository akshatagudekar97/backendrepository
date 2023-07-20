package com.git.Microservice_.Zool.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceZoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZoolApplication.class, args);
	}

}

package com.git.WebserviceCrudGitHubExceptionTask1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class WebserviceCrudGitHubExceptionTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceCrudGitHubExceptionTask1Application.class, args);
	}

}

package com.git.Microservice_Company.app.swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket Apiswagger()
	{
		 return new Docket(DocumentationType.SWAGGER_2).select()
				 .apis(RequestHandlerSelectors.basePackage("com.git.Microservice_Company.app.controller"))
				 .paths(PathSelectors.any()).build();
	

	}
	
}

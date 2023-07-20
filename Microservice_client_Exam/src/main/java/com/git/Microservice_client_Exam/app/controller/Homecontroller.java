package com.git.Microservice_client_Exam.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	
	@RequestMapping(value="/")
	public String save()
	{
		return "Exam";
	}
}

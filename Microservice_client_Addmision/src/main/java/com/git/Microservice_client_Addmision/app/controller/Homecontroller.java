package com.git.Microservice_client_Addmision.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@RequestMapping(value="/")
	public String save()
	{
		System.out.println("Addmission");
		return "Addmission";
	}
}

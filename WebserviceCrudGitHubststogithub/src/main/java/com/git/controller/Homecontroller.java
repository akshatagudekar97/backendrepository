package com.git.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	
	@PostMapping(value="/savedata")
	public String savedata()
	{
		return "success";
	}
}

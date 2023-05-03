package com.git.Addmission.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@PostMapping(value="/savedata")
	public String saveadd()
	{
		return "Addmission";
	}
}

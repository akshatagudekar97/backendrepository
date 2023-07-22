package com.git.Microservice_Prod.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.Microservice_Prod.app.model.user;

@RestController
public class homecontroller {

	
	@RequestMapping(value="/getproduce")
	public List detproradata()
	{
		user u=new user();
		u.setId(1);
		u.setName("abc");
		u.setAdd("xuv");
		u.setMobno("234564567");
		
		List a=new ArrayList<>();
		a.add(u);
		
		return a;
	}
}

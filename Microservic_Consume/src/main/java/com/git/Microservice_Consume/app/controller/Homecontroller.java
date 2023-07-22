package com.git.Microservice_Consume.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Homecontroller
{

	@Autowired
	RestTemplate rt;	
	
	@RequestMapping(value="/getconsume")
	public List consumedata()
	{
		
		String url="http://zuul/add/getproduce";
		List list=rt.getForObject(url, List.class);
		
		return list;
		
	}
	
	
}

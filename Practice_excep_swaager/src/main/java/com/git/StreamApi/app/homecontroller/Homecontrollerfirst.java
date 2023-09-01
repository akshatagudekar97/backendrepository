package com.git.StreamApi.app.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.StreamApi.app.model.customer;
import com.git.StreamApi.app.serviceInt.serviceInt;

@RestController
public class Homecontrollerfirst {

	@Autowired
	serviceInt ses;
	
	@PostMapping(value="/savesxds")
	public String savedfg(@RequestBody customer c)
	{
		 ses.save(c);
		 return "success";
	}
}

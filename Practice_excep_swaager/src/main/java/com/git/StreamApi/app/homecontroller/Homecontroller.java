package com.git.StreamApi.app.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.StreamApi.app.model.customer;
import com.git.StreamApi.app.serviceInt.serviceInt;

@RestController
public class Homecontroller {

	@Autowired
	
	serviceInt se;
	
	@PostMapping(value="/save")
	public ResponseEntity<customer> savecust(@RequestBody customer c)
	{
		
		se.save(c);
		return new ResponseEntity<customer>(c,HttpStatus.CREATED);
	}
}

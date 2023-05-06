package com.git.WebserviceCrudGitHubExceptionTask1.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.WebserviceCrudGitHubExceptionTask1.app.model.User;
import com.git.WebserviceCrudGitHubExceptionTask1.app.serviceI.serviceInte;

@RestController
public class Homecontroller {
	
	@Autowired
	
	serviceInte se;
	
	@PostMapping(value="/saveuser")
	public ResponseEntity<User> saveuser(@RequestBody User u)
	{
		se.saveus(u);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
}

package com.git.WebserviceCrudGitHubExceptionTask1.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		System.out.println(u.getUsername());
		System.out.println(u.getEmail());
		System.out.println(u.getFirstname());
		System.out.println(u.getLastname());
		System.out.println(u.getContactno());
		System.out.println(u.getAge());
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getuser")
	public ResponseEntity<List<User>> getuser()
	{
		List<User> list=se.getuser();
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	}
	
	@PutMapping(value="updateuser")
	public ResponseEntity<User> updateuser(@PathVariable int id,@RequestBody User u)
	{
		se.saveus(u);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteuser")
	public ResponseEntity<User> deleteuser(@PathVariable int id,@ModelAttribute User u)
	{
		se.deleteuser(u);
		return new ResponseEntity<User>(u,HttpStatus.NO_CONTENT);
	}
}

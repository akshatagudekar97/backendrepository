package com.git.Microservice_Com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.Microservice_Com.app.model.Company;
import com.git.Microservice_Com.app.service.serviceInt;

@RestController
@RequestMapping(value="Company")
public class Homecontroller {

	@Autowired
	serviceInt se;
	
	@PostMapping
	public ResponseEntity<Company> createcompnay(@RequestBody Company c)
	{
	return ResponseEntity.status(HttpStatus.CREATED).body(se.create(c));	
	}
	
	@GetMapping
	public ResponseEntity<List<Company>> get()
	{
		return ResponseEntity.status(HttpStatus.OK).body(se.get());
	}
	
	@GetMapping("/{cid}")
	public ResponseEntity<Company> search(@PathVariable String cid)
	{
		return ResponseEntity.status(HttpStatus.OK).body(se.search(cid));
		
	}
	
	@PutMapping("/{cid}")
	public ResponseEntity<Company> update(@PathVariable String cid, @RequestBody Company c)
	{
		return ResponseEntity.status(HttpStatus.OK).body(se.create(c));
		
	}
	
	@DeleteMapping("/{cid}")
	public  ResponseEntity<Company> delete(@PathVariable Company cid)
	{
	return ResponseEntity.status(HttpStatus.NO_CONTENT).body(se.delete(cid));	
	}
}

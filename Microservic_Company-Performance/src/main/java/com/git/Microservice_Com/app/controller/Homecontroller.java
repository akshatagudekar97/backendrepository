package com.git.Microservice_Com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.Microservice_Com.app.model.Performance;
import com.git.Microservice_Com.app.serviceinter.serviceInter;

@RestController
@RequestMapping(value="/performance")
public class Homecontroller {

	
	@Autowired
	serviceInter se;
	
	@PostMapping
	public ResponseEntity<Performance> create(@RequestBody Performance perform)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(se.create(perform));
	}
	
	@GetMapping
	public ResponseEntity<List<Performance>> getall()
	{
		return ResponseEntity.ok(se.getPerformance());
		
	}
	
	@GetMapping(value="/Employee/{empid}")
	public ResponseEntity<List<Performance>> getemployeeid(@PathVariable String empid)
	{
		return ResponseEntity.status(HttpStatus.OK).body(se.getEmployeeId(empid));
	}
	
	@GetMapping(value="/Company/{cid}")
	public ResponseEntity<List<Performance>> getcompanyid(@PathVariable String cid)
	{
		return ResponseEntity.status(HttpStatus.OK).body(se.getcompanyid(cid));
	}
}

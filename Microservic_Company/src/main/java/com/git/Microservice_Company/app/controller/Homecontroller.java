package com.git.Microservice_Company.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.git.Microservice_Company.app.User.Employee;
import com.git.Microservice_Company.app.User.Performance;
import com.git.Microservice_Company.app.serviceImplement.Service_implements;
import com.git.Microservice_Company.app.serviceinterface.Service_Inteface;

@RestController
public class Homecontroller {

	@Autowired
	Service_Inteface se;
	
	
	/* @Autowired private RestTemplate restTem; private Logger logg=
	 * LoggerFactory.getLogger(Service_implements.class); */
	
	@PostMapping(value="/save")
	public ResponseEntity<Employee> save(@RequestBody Employee emp)
	{
		Employee e = se.saveEmp(emp);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(e);
		
	}
	
	@GetMapping(value="/get")
	public ResponseEntity<List<Employee>> get()
	{
		List<Employee> list=(List<Employee>) se.getEmp();
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@PutMapping(value="/update/{empid}")
	public ResponseEntity<Employee> update(@PathVariable int empid, @RequestBody Employee emp)
	{
		se.saveEmp(emp);
		return new ResponseEntity<Employee>(emp ,HttpStatus.OK);
	}
	
	@GetMapping(value="/getsearch/{empid}")  
	public ResponseEntity<Employee> searchget(@PathVariable int empid,Employee emp)
	{
		Employee list=se.searchEmp(empid);
		return new ResponseEntity<Employee>(list,HttpStatus.OK);
		
		/* ArrayList<Performance> rest =
		 * restTem.getForObject("http://localhost:8083/performance/Employee/"+list.
		 * getEmpid() , ArrayList.class);* 
		 * logg.info("{}",rest);* 
		 * list.setPerform(rest); */
	}
	
	@DeleteMapping(value="/delete/{empid}")
	public ResponseEntity<Employee> delete(@PathVariable int empid, Employee emp)
	{
		se.deleteEmp(emp);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.NO_CONTENT);
	}
}

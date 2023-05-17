package com.git.WebserviceCrudGitHubException.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.WebserviceCrudGitHubException.app.esrviceI.serviceInte;
import com.git.WebserviceCrudGitHubException.app.model.Product;

@RestController
public class Homecontrollerfirst {

	
	@Autowired
	serviceInte ser;
	
	@PostMapping(value="/postdata")
	public String savedata(@RequestBody Product pr)
	{
		ser.saveproduct(pr);
		return "success";
	}
	
	
	@GetMapping(value="/getdataall")
	public ResponseEntity<List<Product>> getproduct()
	{
		List<Product> product=ser.getproduct();
		return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
	}
}

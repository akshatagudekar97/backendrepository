package com.git.WebserviceCrudGitHubException.app.controller;

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

import com.git.WebserviceCrudGitHubException.app.esrviceI.serviceInte;
import com.git.WebserviceCrudGitHubException.app.model.Product;

@RestController
public class Homecontroller {

	@Autowired
	
	serviceInte se;
	
	@PostMapping(value="/savedata" )
	public ResponseEntity<Product> saveproduct(@RequestBody Product pr)
	{
		se.saveproduct(pr);
		
		return new ResponseEntity<Product>(pr,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getdata")
	public ResponseEntity<List<Product>> getproduct()
	{
		List<Product> product=se.getproduct();
		return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
	}
	
	@PutMapping(value="/updatedata/{id}")
	public ResponseEntity<Product> updateproduct(@PathVariable int id,@RequestBody Product pr)
	{
		se.saveproduct(pr);
		return new ResponseEntity<Product>(pr,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deletedata")
	public ResponseEntity<Product> deleteproduct(@PathVariable int id,@ModelAttribute Product pr)
	{
		se.deleteproduct(pr);
		
		return new ResponseEntity<Product>(pr,HttpStatus.NO_CONTENT);
	}
	
	@GetMapping(value="/search/{productName}")
	public ResponseEntity<List<Product>> seachproduct(@PathVariable String productName)
	{
		List<Product> p=se.searchproduct(productName);
		return new ResponseEntity<List<Product>>(p,HttpStatus.OK);
	}
	
}

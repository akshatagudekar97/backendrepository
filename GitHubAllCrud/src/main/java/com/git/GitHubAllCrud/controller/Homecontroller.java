package com.git.GitHubAllCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.GitHubAllCrud.model.Student;
import com.git.GitHubAllCrud.serviceI.serviceInte;

@RestController
public class Homecontroller {

	
	@Autowired
	
	serviceInte se;
	
	@PostMapping(value="/savedata")
	public String savestudent(@RequestBody Student s)
	{
		se.savestudent(s);
		return "success";
	}
	
	@GetMapping(value="/getdata")
	public List<Student> getstudent()
	{
		List<Student> list=se.getstudent();
		return list;
	}
	
	@PutMapping(value="/updatedata/{id}")
	public String updatedata(@PathVariable int id, @RequestBody Student s)
	{
		se.savestudent(s);
		return "update";
	}
	
	@DeleteMapping(value="/deletedata/{id}")
	public String deletestudent(@PathVariable int id,@ModelAttribute Student s)
	{
		se.deletestudent(s);
		return "delete";
	}
	
}

package com.git.User.app.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.User.app.model.student;
import com.git.User.app.serviceeInte.serviceint;

@RestController
@RequestMapping("/users")
public class controllerfirst {

	@Autowired
	serviceint sess;
	
	@PostMapping
	public void saveasd( @RequestBody student s)
	{
		sess.save(s);
	}
	
	
	
}

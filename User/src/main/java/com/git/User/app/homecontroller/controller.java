package com.git.User.app.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.git.User.app.model.emailsender;
import com.git.User.app.model.student;
import com.git.User.app.serviceeInte.serviceint;
import com.git.User.app.serviceimpl.serviceimpl;

@RestController
public class controller {

	@Autowired
	serviceint se;

	@Value("${spring.mail.username}")
	String username;

	// email sending task
	@PostMapping(value = "/sendmail")
	public String emailsender(@RequestBody emailsender es) {

		es.setFrom(username);

		se.sendmail(es);

		return "send successful";
	}

	@PostMapping(value="/sendemailattachment")
	public String emailattachment(@RequestParam("file") MultipartFile file,@RequestParam("file1") MultipartFile file1 , @RequestParam("data")String data)
	{
	try
	{
		ObjectMapper om=new ObjectMapper();
		emailsender e=om.readValue(data, emailsender.class);
		e.setFrom(username);
		se.sendwithattachment(e,file);
		se.sendwithattachment(e,file1);
	}
	 catch(Exception e) {
			e.printStackTrace();
			return "fail";
		}
	
	
	return "send email succeddfully";
	
	}
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<student> saveexception(@RequestBody student s) {
		se.save(s);

		return new ResponseEntity<student>(s, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get")
	public ResponseEntity<List<student>> getstudent() {
		List<student> list = se.getstudent();

		return new ResponseEntity<List<student>>(list, HttpStatus.OK);
	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<student> update(@PathVariable int id, @RequestBody student s) {
		se.save(s);
		return new ResponseEntity<student>(s, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<student> delete(@PathVariable int id, @ModelAttribute student s) {
		se.delete(s);
		return new ResponseEntity<student>(s, HttpStatus.NO_CONTENT);
	}

	
	@GetMapping(value="/search/{id}")
	public ResponseEntity<List<student>> searchdata(@PathVariable int id)
	{
		List<student> list1=se.serchproduct(id);
		return new ResponseEntity<List<student>>(list1,HttpStatus.OK);
	}
	
	@GetMapping(value="/searchname/{name}")
	public ResponseEntity<List<student>> seachname(@PathVariable String name)
	{
		List<student> l2=se.searchname(name);
		return new ResponseEntity<List<student>>(l2,HttpStatus.OK);
	}
}

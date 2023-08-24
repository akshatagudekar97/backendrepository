package com.git.SpringbootRestApiEmailSendingAndAttachment.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.git.SpringbootRestApiEmailSendingAndAttachment.app.model.EmailSender;
import com.git.SpringbootRestApiEmailSendingAndAttachment.app.serviceI.ServiceInte;


@RestController
public class Homecontroller {
		
	@Autowired
	
	ServiceInte se;
	
	@Value("${spring.mail.username}")
	String username;
	
	@PostMapping(value="/sendemail")
	public String emailsender(@RequestBody EmailSender es)
	{
		es.setFrom(username);
		
		se.sendemail(es);
		
		return "send mail successfully";
		
	}
	
	@PostMapping(value="/sendattchmentj")
	public String emailsendattachment(@RequestParam("file") MultipartFile file,@RequestParam("file1") MultipartFile file1,@RequestParam("data")String data)
	{
		
		try
		{
			ObjectMapper om=new ObjectMapper();
			EmailSender e=om.readValue(data, EmailSender.class);
			e.setFrom(username);
			se.sendemailwithattachment(e,file);
			se.sendemailwithattachment(e, file1);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
			return "fail";
		}
		return "send email successfully";
	}
	
}

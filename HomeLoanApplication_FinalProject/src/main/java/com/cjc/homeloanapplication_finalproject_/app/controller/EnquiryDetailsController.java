package com.cjc.homeloanapplication_finalproject_.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloanapplication_finalproject_.app.model.EnquiryDetails;
import com.cjc.homeloanapplication_finalproject_.app.servicei.EnquiryDetailsServiceI;

@RestController
public class EnquiryDetailsController {

	@Autowired
	EnquiryDetailsServiceI edsi;
	
	@PostMapping(value = "/insertEnquiryDetails")
	public ResponseEntity<EnquiryDetails> savedata(@RequestBody EnquiryDetails e)
	{
		edsi.saveEnquiryDetails(e);
		return new  ResponseEntity<EnquiryDetails>(e,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/GetAllEnquiryDetails")
	public ResponseEntity<List<EnquiryDetails>> getAllData()
	{
		List<EnquiryDetails> list=edsi.DisplayEnquiryDetails();
		return new  ResponseEntity<List<EnquiryDetails>>(list,HttpStatus.OK);
	}
	
}

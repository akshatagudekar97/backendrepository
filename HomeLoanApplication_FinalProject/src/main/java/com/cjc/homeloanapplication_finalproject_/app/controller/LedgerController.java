package com.cjc.homeloanapplication_finalproject_.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloanapplication_finalproject_.app.serviceimpl.LedgerImpl;

@RestController
public class LedgerController {

	@Autowired
	
	LedgerImpl led;
	
	

	
	
}

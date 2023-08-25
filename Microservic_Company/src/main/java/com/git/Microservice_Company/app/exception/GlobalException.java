package com.git.Microservice_Company.app.exception;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Error> EmployeeException(EmployeeNotFoundException e, HttpServletRequest request)
	{
	
		System.out.println("Global Exception Handle");
		Error error= new Error(HttpStatus.NOT_FOUND.value(), e.getMessage(),
				new Date(), HttpStatus.NOT_FOUND, request.getRequestURI());
		return new ResponseEntity<Error>(error,HttpStatus.NOT_FOUND); 
		
	}
}

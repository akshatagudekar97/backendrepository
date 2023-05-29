package com.cjc.homeloanapplication_finalproject_.app.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(FirstNameNotFoundException.class)
	public ResponseEntity<ApiError> FirstNameFoundExceptionHandler(FirstNameNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(LastNameNotFoundException.class)
	public ResponseEntity<ApiError> LastNameFoundExceptionHandler(LastNameNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MiddleNameNotFoundException.class)
	public ResponseEntity<ApiError> MiddleNameFoundExceptionHandler(MiddleNameNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmailNotFoundException.class)
	public ResponseEntity<ApiError> EmailNotFoundExceptionHandler(EmailNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<ApiError> AgeNotFoundExceptionHandler(AgeNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ContactNotFoundException.class)
	public ResponseEntity<ApiError> contactNotFoundExceptionHandler(ContactNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AdharcardNotFoundException.class)
	public ResponseEntity<ApiError> AdharcardNotFoundExceptionHandler(AdharcardNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PancardNotFoundException.class)
	public ResponseEntity<ApiError> PancardNotFoundExceptionHandler(PancardNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(GenderNotFoundException.class)
	public ResponseEntity<ApiError> GenderNotFoundExceptionHandler(GenderNotFoundException e,HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handel");
		
	
		ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return new ResponseEntity<ApiError>(error,HttpStatus.NOT_FOUND);
	}
}

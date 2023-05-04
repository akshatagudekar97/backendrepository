package com.git.WebserviceCrudGitHubException.app.exception;

import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ApiError ProductNotFoundExceptionHandler(ProductNotFoundException e, HttpServletRequest request)
	{
		System.out.println("Global Based Exception Handler");
		
		ApiError error =new ApiError(HttpStatus.NOT_FOUND.value(),
				
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND,request.getRequestURI() );
		
		return error;
	}
}
//global
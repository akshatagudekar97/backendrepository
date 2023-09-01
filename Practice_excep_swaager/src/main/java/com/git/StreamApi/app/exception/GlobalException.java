package com.git.StreamApi.app.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public Apierror StudentException(StudentNotFoundException s, HttpServletRequest request)
	{
		Apierror error=new Apierror(HttpStatus.NOT_FOUND.value(),new Date(),s.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI());
		return error;
	}
}

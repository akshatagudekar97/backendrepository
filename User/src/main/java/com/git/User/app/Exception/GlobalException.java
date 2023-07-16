package com.git.User.app.Exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(studentNotFoundException.class)
	public Apierror studentNotFoundExceptionHandler(studentNotFoundException e , HttpServletRequest request)
	{
		
		System.out.println("global based exception");
		Apierror error = new Apierror(HttpStatus.NOT_FOUND.value(),
				e.getMessage(),new Date(),HttpStatus.NOT_FOUND, request.getRequestURI());
		
		return error;
	}
}

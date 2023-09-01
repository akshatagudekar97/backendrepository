package com.git.Microservice_Com.app.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> ResoureException(ResourceNotFoundException resorce, HttpServletRequest request)
	{
	Map<String, Object> map=new HashMap<>();
	map.put("msg", resorce.getMessage());
	map.put("status",HttpStatus.NOT_FOUND);
	map.put("urlpath",request.getRequestURI());
	map.put("date", new Date());
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	
	}
}

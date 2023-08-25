package com.git.Microservice_Company.app.exception;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(String msg)
	{
		super(msg);
	}
}

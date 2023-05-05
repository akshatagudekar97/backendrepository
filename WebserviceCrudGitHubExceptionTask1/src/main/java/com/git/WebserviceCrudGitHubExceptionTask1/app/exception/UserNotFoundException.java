package com.git.WebserviceCrudGitHubExceptionTask1.app.exception;

public class UserNotFoundException extends RuntimeException{

	
	public UserNotFoundException(String msg)
	{
		super(msg);
	}
}

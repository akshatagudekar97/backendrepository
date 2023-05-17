package com.git.WebserviceCrudGitHubExceptionTask1.app.serviceI;

import java.util.List;

import com.git.WebserviceCrudGitHubExceptionTask1.app.model.User;

public interface serviceInte {
		
	
	public void saveus(User u);
	
	public List<User> getuser();
	
	public void deleteuser(User u);
	
}

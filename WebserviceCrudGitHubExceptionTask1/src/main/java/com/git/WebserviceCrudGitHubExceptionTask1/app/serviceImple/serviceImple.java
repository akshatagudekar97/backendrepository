package com.git.WebserviceCrudGitHubExceptionTask1.app.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.WebserviceCrudGitHubExceptionTask1.app.exception.UserNotFoundException;
import com.git.WebserviceCrudGitHubExceptionTask1.app.model.User;
import com.git.WebserviceCrudGitHubExceptionTask1.app.repository.repository;
import com.git.WebserviceCrudGitHubExceptionTask1.app.serviceI.serviceInte;

@Service
public class serviceImple implements serviceInte
{
	
	@Autowired
	
	repository re;

	
	@Override
	public User saveus(User u) 
	{
		re.save(u);
		
		 if (u.getUsername().length() == 10 && Character.isDigit(u.getUsername().charAt(u.getUsername().length() - 1)) && SpecialCharacter(u.getUsername())) 
		 	{
		        return u;
		    } 
		 else 
		 	{
		    	
		        throw new UserNotFoundException("UserName Not Correct");
		    }
	
	 }
        private boolean SpecialCharacter(String s) 
          {
 	           String specialCharacters = "!@#$%&*";
		          for (int i = 0; i < s.length(); i++) 
		          {
		             if (specialCharacters.contains(String.valueOf(s.charAt(i)))) 
		              {
		                  return true;
		               }
		            
		          }
				return false;	
           
          }
}

 
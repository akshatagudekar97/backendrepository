package com.git.WebserviceCrudGitHubExceptionTask1.app.serviceImple;

import java.util.List;

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
	public void saveus(User u) 
	{
		
		/*
		 * if (u.getUsername().length() == 10 &&
		 * Character.isDigit(u.getUsername().charAt(u.getUsername().length() - 1)) &&
		 * u.getUsername().startsWith("@") && u.getEmail().endsWith("@gmail.com") &&
		 * Character.isUpperCase(u.getFirstname().charAt(0)) &&
		 * Character.isUpperCase(u.getFirstname().charAt(0)) && u.getAge()>=18 &&
		 * u.getContactno()==10)
		 * 
		 * { re.save(u);
		 * 
		 * } else{
		 * 
		 * throw new UserNotFoundException("UserNotFoundException");
		 * 
		 * }
		 */
		 
		 
             if (u.getUsername().length() == 10 && Character.isDigit(u.getUsername().charAt(u.getUsername().length() - 1)) && u.getUsername().startsWith("@")) 
			       {			
			            if (u.getEmail().endsWith("@gmail.com"))
			            {
			            	
			                if (Character.isUpperCase(u.getFirstname().charAt(0))) 
			                {
			                	
			                	 if (Character.isUpperCase(u.getLastname().charAt(0))) 
			                	 {
			                		 
			                          if (u.getAge() >= 18) 
			                            {
			                    	//String.valueOf(u.getContactno()).length(
			                               if (String.valueOf(u.getContactno()).length() == 10) 
			                                 {
			                        	
			                                    re.save(u);
			                                 } 
			                               else 
			                               {
			                                  throw new UserNotFoundException("UserContactNotCorrectException");
			                                }
			                            }else 
			                          {
			                       throw new UserNotFoundException("User Age NotFoundException");
			                    }
			                } else {
			                    throw new UserNotFoundException("LastNotFoundException");
			                }
			            } else {
			                throw new UserNotFoundException("UserfirstNameNotCorrectException");
			            }
			        } else {
			            throw new UserNotFoundException("UserEmailNotCorrectException ");
			            }
			        }
			     else {
				    throw new UserNotFoundException("UserNameNotCorrectException");
				}
	        }
		     
        
        @Override
		public List<User> getuser() {
        	 List<User>list= (List<User>) re.findAll();
			return list;
		}
		@Override
		public void deleteuser(User u) {
			re.delete(u);
			
		}
}



















































/*
 * if(u.getEmail().endsWith("@gmail.com")) { return u; }
 * 
 * else { throw new UserNotFoundException("Email Not Correct"); }
 * 
 * 
 * 
 * if(Character.isUpperCase(u.getFirstname().charAt(0))) {
 * 
 * } else { throw new
 * UserNotFoundException("FirstLatter Is Always be Uppercase");
 * 
 * }
 * 
 * 
 * if(Character.isUpperCase(u.getFirstname().charAt(0))) {
 * 
 * } else {
 * 
 * }
 * 
 * re.save(u);
 * 
 * }
 */
		     
 
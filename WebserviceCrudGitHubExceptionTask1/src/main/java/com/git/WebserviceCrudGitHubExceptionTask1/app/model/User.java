package com.git.WebserviceCrudGitHubExceptionTask1.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	@Id
	
	private int userid;
	
	  //@Min(10) //@Max(10) 
	     private String username;
	  
	  @Email 
	  private String email;
	  
	  private String firstname; 
	  private String lastname; //@Max(10) 
	  private long  contactno; 
	  
	  private int age;
	 
	
	
	

	/*
	 * @NotBlank
	 * 
	 * @Size(min = 10, max = 10)
	 * 
	 * @Pattern(regexp = ".*@.*") private String username;
	 * 
	 * @NotBlank
	 * 
	 * @Email private String email;
	 * 
	 * @NotBlank private String firstname;
	 * 
	 * @NotBlank private String lastname;
	 * 
	 * @NotBlank
	 * 
	 * @Size(min = 10, max = 10)
	 * 
	 * @Pattern(regexp = "\\d+") private String contactno;
	 * 
	 * @NotNull
	 * 
	 * @Min(18) private int age;
	 */
	
}

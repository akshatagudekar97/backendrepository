package com.git.WebserviceCrudGitHubExceptionTask1.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
	@Min(1)
	@Max(10)
	private String username;
	
	@Email(message = "")
	@NotNull
	private String email;
	
	private String firstname;
	private String lastname;
	private long contactno;
	private  int age;
	
}

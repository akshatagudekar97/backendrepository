package com.git.WebserviceCrudGitHubExceptionTask1.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	private String username;
	private String email;
	private String firstname;
	private String lastname;
	private long contactno;
	private  int age;
	
}

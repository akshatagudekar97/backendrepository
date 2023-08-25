package com.git.Microservice_Company.app.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Emplouee_user")
public class Employee {

	@Id
	
	@Column(name="Id")
	private int empid;
	
	@Column(name="Name" , length = 10)
	private String empname;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="About")
	private String about;
	
	
}

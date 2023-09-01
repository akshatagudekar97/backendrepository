package com.git.Microservice_Company.app.User;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Employee")
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
	
	@Transient
	private List<Performance> perform= new ArrayList<Performance>();
	
	
}

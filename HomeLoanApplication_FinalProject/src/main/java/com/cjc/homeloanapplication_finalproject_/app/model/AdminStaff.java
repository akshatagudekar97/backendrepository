package com.cjc.homeloanapplication_finalproject_.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminStaff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adninid;
	private String stafffullname;
	private String staffusername;
	private String staffpassword;
	private String staffpost;
	
}

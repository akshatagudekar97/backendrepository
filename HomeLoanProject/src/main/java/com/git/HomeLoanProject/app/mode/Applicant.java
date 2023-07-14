package com.git.HomeLoanProject.app.mode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int appid;
	private String name;
	private int contactno;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	private  Appaddress address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cibilscore cibils;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Document docum;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Education educ;
	
	
	
}

package com.git.HomeLoanProject.app.mode;

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

public class Education {
	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int eid;
	private String degree;
	private String collegename;
	private String address;
	

}

package com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicantid;
	private String applicantname;
	private String applicantemail;
	private String mobilenumber;
	private String applicantage;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Document  AppDoc;
}

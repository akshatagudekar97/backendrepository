package com.cjc.homeloanapplication_finalproject_.app.model;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applicant
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int appid;
	private String firstname;
	private String middlename;
	private String lastname;
	private String mothername;
	private long contactno;
	private int age;
	private String email;
	private long adharcard;
	private String pancard;
	private String gender;
	private String dateofbirth;
	private String maritalstatus;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private ApplicantAddress applicantaddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ProfessionalDetails proffessionaldetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ApplicantBankDetails applicantbankdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CibilScore cibilscore;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ApplicantGuarantorDetails applicantguarantorDetails;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private ApplicantDocuments applicantdocument;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyDetails propertydetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Education education;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ProcessingFees processingfees;
	
	
	
}

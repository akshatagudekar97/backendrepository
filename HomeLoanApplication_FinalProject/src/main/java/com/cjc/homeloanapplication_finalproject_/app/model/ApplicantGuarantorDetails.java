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
public class ApplicantGuarantorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guarantorid;
	private String guarantorfirstname;
	private String guarantormiddlename;
	private String guarantorlastname;
	private String dateofbirth;
	private String guarantorgender;
	private String guarantoraddress;
	             
	private long guarantormobile=0;
	private String guarantoremailid;
	private long guarantoradharno;
	private String guarantorpancardno;
	private String guarantorRelationWithCustomer;
	
	
}

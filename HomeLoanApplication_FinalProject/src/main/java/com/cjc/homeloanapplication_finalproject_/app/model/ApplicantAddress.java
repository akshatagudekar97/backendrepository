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
public class ApplicantAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String permanentaddress;
	private String houseNumber;
	private String landmark;
	private String streetName;
	private String city;
	private String taluka;
	private String district;
	private String state;
	private String country;
	private String pincode;
	private String tempaddress;
	
	
	
}

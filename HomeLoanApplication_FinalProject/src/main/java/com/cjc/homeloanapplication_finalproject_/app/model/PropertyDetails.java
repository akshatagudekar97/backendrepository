package com.cjc.homeloanapplication_finalproject_.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyId;
	private String ownerName;
	private String propertyName;
	private String propertyArea;
	private String propertyAddress;
	private double requiredloanamount;
	private double costofproperty;
	@Lob
	private byte[] carporationPermissionLetter;
	
}

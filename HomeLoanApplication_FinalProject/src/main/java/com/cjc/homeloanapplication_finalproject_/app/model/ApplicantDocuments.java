package com.cjc.homeloanapplication_finalproject_.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantDocuments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int documentidentifier;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] thumb;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] bankcheque;
	@Lob
	private byte[] incomeproof;
	@Lob
	private byte[] bankstatement;
	@Lob
	private byte[] ITR;
	@Lob
	private byte[] form16;
	
	
	
	
	
}

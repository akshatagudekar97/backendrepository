package com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Document {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentid;
	
	@Lob
	private byte[] applicantresume;
	@Lob
	private byte[] eperienceletter;
	@Lob
	private byte[] salleryslip;
	@Lob
	private byte[] privoiuscompanyletter;
	
 }

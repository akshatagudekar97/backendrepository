package com.git.HomeLoanProject.app.mode;

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

public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	@Lob
	private byte[]photo;
	
	@Lob
	private byte[]pancard;
	
	@Lob
	private byte[] adharcard;
	
	@Lob
	private byte[]signamture;
	
	
}

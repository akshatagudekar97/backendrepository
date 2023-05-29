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
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int educationid;
	private String degree;
	private String collegename;
	private String cityname;
}

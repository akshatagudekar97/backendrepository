package com.git.Microservice_Com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Company")
public class Company {

	@Id
	 private String cid;
	private String name;
	private String location;
	private String about;
	
}

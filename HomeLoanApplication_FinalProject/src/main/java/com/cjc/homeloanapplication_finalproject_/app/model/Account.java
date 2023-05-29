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
public class Account
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountno;
	private String accountname;
	private String accounttype;
	private String dateofopeningaccount;
	private String bankname;
	private String branchname;
	private String IFSCcode;
	
}

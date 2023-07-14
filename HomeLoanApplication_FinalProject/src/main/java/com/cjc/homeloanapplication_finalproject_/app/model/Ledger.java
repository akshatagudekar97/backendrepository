package com.cjc.homeloanapplication_finalproject_.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ledger {

	@Id
	private int lid;
	private Integer ledgerId;
	private String contactNumber;
	private String ledgerFirstName;
	private String ledgerLastName;
	private Integer ledgerNumber;
	@UpdateTimestamp
	private Date ledgerCreateDate;
	private Double loanAmount;
	private String loanStatus;
	private Double totalPaywithIntrest;
	private Integer tenure;
	private String previousEmiStatus;
	private String emiStatus;
	private Float rateOfIntrest;
	private Double monthlyEmi;
	private Double remainingAmount;
	private Integer noOfEmiBalance;
	private Double amountPaidTillDate;
	private Integer defaulterCount;
	private String nextEmiDate;
	@UpdateTimestamp
	private Date lastEmiDate;
	
}

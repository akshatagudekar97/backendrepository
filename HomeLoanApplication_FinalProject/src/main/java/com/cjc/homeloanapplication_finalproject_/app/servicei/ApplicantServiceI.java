package com.cjc.homeloanapplication_finalproject_.app.servicei;

import java.util.List;

import com.cjc.homeloanapplication_finalproject_.app.model.Applicant;

public interface ApplicantServiceI {

	Applicant saveApplicant(Applicant a);

	List<Applicant> DisplayAllApplicant();

	
	void deleteApplicant(int appid);




}

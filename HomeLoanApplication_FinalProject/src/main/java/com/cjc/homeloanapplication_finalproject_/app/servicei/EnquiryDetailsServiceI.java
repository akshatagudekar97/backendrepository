package com.cjc.homeloanapplication_finalproject_.app.servicei;

import java.util.List;

import com.cjc.homeloanapplication_finalproject_.app.model.EnquiryDetails;

public interface EnquiryDetailsServiceI {

	void saveEnquiryDetails(EnquiryDetails e);

	List<EnquiryDetails> DisplayEnquiryDetails();

}

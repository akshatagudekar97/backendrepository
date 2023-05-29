package com.cjc.homeloanapplication_finalproject_.app.servicei;

import org.springframework.web.multipart.MultipartFile;

public interface EmailDetailsServiceI {


	void rejectionMailSend(String to);

	void loanappiareMailSend(String to);
	
	void approvalMailSend(String to, MultipartFile sanctionLetter);
	
	void documentsMailSend(String to, MultipartFile sanctionLetter);

	void disburseMailSend(String to, MultipartFile sanctionLetter);

	void defaulterMailSend(String to, MultipartFile sanctionLetter);

	void fullNillLoan(String to, MultipartFile sanctionLetter);

	

}

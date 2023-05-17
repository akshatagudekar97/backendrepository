package com.git.SpringbootRestApiEmailSendingAndAttachment.app.serviceI;

import org.springframework.web.multipart.MultipartFile;

import com.git.SpringbootRestApiEmailSendingAndAttachment.app.model.EmailSender;

public interface ServiceInte {
		
	public void sendemail(EmailSender es);
	public void sendemailwithattachment(EmailSender es, MultipartFile file);
}

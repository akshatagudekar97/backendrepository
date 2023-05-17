package com.git.SpringbootRestApiEmailSendingAndAttachment.app.serviceImple;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.git.SpringbootRestApiEmailSendingAndAttachment.app.model.EmailSender;
import com.git.SpringbootRestApiEmailSendingAndAttachment.app.serviceI.ServiceInte;
@Service
public class serviceImple implements ServiceInte{

	
	@Autowired
	JavaMailSender  jms;

	@Override
	public void sendemail(EmailSender es) {
		SimpleMailMessage m=new SimpleMailMessage();
		
		m.setTo(es.getTo());
		m.setFrom(es.getFrom());
		m.setSubject(es.getSubject());
		m.setText(es.getTextbodymsg());
		
		jms.send(m);
	}

	@Override
	public void sendemailwithattachment(EmailSender es,MultipartFile file) {
		
		MimeMessage mimemsg=jms.createMimeMessage();
		try {
		MimeMessageHelper mimeheap=new MimeMessageHelper(mimemsg,true);
		
		mimeheap.setTo(es.getTo());
		mimeheap.setFrom(es.getFrom());
		mimeheap.setSubject(es.getSubject());
		mimeheap.setText(es.getTextbodymsg());
		mimeheap.addAttachment(file.getOriginalFilename(), file);
		}
		
		catch(MessagingException e)
		{
			e.printStackTrace();
		}
		
		jms.send(mimemsg);
	}
	
	
}

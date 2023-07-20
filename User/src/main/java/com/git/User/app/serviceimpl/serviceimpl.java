package com.git.User.app.serviceimpl;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.git.User.app.Exception.studentNotFoundException;
import com.git.User.app.model.emailsender;
import com.git.User.app.model.student;
import com.git.User.app.repository.repositorydemo;
import com.git.User.app.serviceeInte.serviceint;

@Service
public class serviceimpl implements serviceint {

	@Autowired
	repositorydemo re;

	@Autowired
	JavaMailSender jms;

	@Override
	public void save(student s) {

		if (s.getName().length() == 6 && s.getName().startsWith("A")) {
			re.save(s);
		} else {
			throw new studentNotFoundException("Name Not corrected");
		}

	}

	@Override
	public void sendmail(emailsender es) {

		SimpleMailMessage m = new SimpleMailMessage();
		m.setTo(es.getTo());
		m.setFrom(es.getFrom());
		m.setSubject(es.getSubject());
		m.setText(es.getTextbodymsg());

		jms.send(m);

	}

	@Override
	public List<student> getstudent() {
		List<student> list = (List<student>) re.findAll();
		return list;
	}

	@Override
	public void delete(student s) {
		re.delete(s);

	}
	
	
	@Override
	public void sendwithattachment(emailsender e, MultipartFile file) {
		MimeMessage mime=jms.createMimeMessage();
		
		try {
			MimeMessageHelper mimehelp=new MimeMessageHelper(mime,true);
			
			mimehelp.setTo(e.getTo());
			mimehelp.setFrom(e.getFrom());
			mimehelp.setSubject(e.getSubject());
			mimehelp.setText(e.getTextbodymsg());
			mimehelp.addAttachment(file.getOriginalFilename(), file);
		}
		catch (MessagingException e1)
		{
		e1.printStackTrace();		
	}
	jms.send(mime);

}

	@Override
	public List<student> serchproduct(int id) {
		
	  List<student>i1=re.findById(id); 
		return i1;
	}

	@Override
	public List<student> searchname(String name) {
		List<student> list=re.findByName(name);	
		return list;
	}


}
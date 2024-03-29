package com.git.User.app.serviceeInte;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.git.User.app.model.emailsender;
import com.git.User.app.model.student;

public interface serviceint {

	
	public void save(student s);

	public void sendmail(emailsender es);

	public List<student> getstudent();

	public void delete(student s);

	public void sendwithattachment(emailsender e, MultipartFile file);
	
	public List<student> serchproduct(int id);
	

	List<student> searchname(String name);
	
}

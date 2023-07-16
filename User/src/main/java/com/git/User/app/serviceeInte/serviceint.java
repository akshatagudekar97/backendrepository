package com.git.User.app.serviceeInte;

import java.util.List;

import com.git.User.app.model.emailsender;
import com.git.User.app.model.student;

public interface serviceint {

	
	public void save(student s);

	public void sendmail(emailsender es);

	public List<student> getstudent();

	public void delete(student s);
	
	
}

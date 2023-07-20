package com.git.User.app.repository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.User.app.model.student;

@Repository
public interface repositorydemo extends CrudRepository<student, Integer>{

	List<student> findById(int id);
	public List<student> findByName(String name);
	

	
}

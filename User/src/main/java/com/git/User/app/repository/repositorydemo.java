package com.git.User.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.User.app.model.student;

@Repository
public interface repositorydemo extends CrudRepository<student, Integer>{

}

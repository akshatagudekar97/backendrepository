package com.git.WebserviceCrudGitHubExceptionTask1.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.WebserviceCrudGitHubExceptionTask1.app.model.User;

@Repository
public interface repository extends CrudRepository<User, Integer>{
	
}

package com.git.HomeLoanProject.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.HomeLoanProject.app.mode.Applicant;

@Repository
public interface ApplicantRepos extends CrudRepository<Applicant, Integer>{
	
	

}

package com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model.Applicant;

@Repository
public interface repositoryi extends CrudRepository<Applicant, Integer>{

}

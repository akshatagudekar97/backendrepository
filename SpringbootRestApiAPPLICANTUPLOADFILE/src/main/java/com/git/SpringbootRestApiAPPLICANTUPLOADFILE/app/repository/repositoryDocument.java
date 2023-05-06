package com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model.Document;

@Repository
public interface repositoryDocument extends CrudRepository<Document, Integer>{

}

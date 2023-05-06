package com.git.SpringbootRestApiFileUploadingApp.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.SpringbootRestApiFileUploadingApp.app.model.Document;

@Repository
public interface repositoryI extends CrudRepository<Document, Integer>{

}


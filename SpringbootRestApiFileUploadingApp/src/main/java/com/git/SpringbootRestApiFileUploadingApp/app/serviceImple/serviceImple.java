package com.git.SpringbootRestApiFileUploadingApp.app.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.SpringbootRestApiFileUploadingApp.app.model.Document;
import com.git.SpringbootRestApiFileUploadingApp.app.repository.repositoryI;
import com.git.SpringbootRestApiFileUploadingApp.app.serviceInte.serviceInte;

@Service
public class serviceImple implements serviceInte{

		
	@Autowired
	repositoryI re;
	
	@Override
	public Document saveDocument(Document dd) {
		
		return re.save(dd);
	}

	@Override
	public List<Document> getDocument() {
		List<Document> document=(List<Document>) re.findAll();
		
		
		return document;
	}

	@Override
	public void deletedocument(Document dd) {
		
		re.delete(dd);
	}

}

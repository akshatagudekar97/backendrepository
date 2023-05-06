package com.git.SpringbootRestApiFileUploadingApp.app.serviceInte;

import java.util.List;

import com.git.SpringbootRestApiFileUploadingApp.app.model.Document;

public interface serviceInte {

	public Document saveDocument(Document dd);
	public List<Document> getDocument();
	public void deletedocument(Document dd);

}
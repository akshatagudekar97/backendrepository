package com.git.SpringbootRestApiFileUploadingApp.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.git.SpringbootRestApiFileUploadingApp.app.model.Document;
import com.git.SpringbootRestApiFileUploadingApp.app.serviceInte.serviceInte;

@RestController
public class Homecontroller 
{
		
	@Autowired
	
	serviceInte se;
	
	@PostMapping(value="/document")

	public Document saveDocument(@RequestParam("photo") MultipartFile file1,
			@RequestParam("pancard") MultipartFile file2,@RequestParam("custid") String data)throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Document dd=om.readValue(data, Document.class);
		dd.setPhotot(file1.getBytes());
		dd.setPancard(file2.getBytes());
		return se.saveDocument(dd);
		
	}
	
	
	@GetMapping(value="/getdocument")
	public List<Document> getdocument()
	{
		List<Document> document=se.getDocument();
		return document;
	}
	
	@PutMapping(value="/updatedocument/{docid}")
	public Document updatedocumentation(@PathVariable("docid") int docid, @RequestParam("photo") MultipartFile file1,
			@RequestParam("pancard") MultipartFile file2,@RequestParam("custid") String data)throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Document dd=om.readValue(data, Document.class);
		dd.setDocid(docid);
		dd.setPhotot(file1.getBytes());
		dd.setPancard(file2.getBytes());
		return se.saveDocument(dd);
	}
	
		@DeleteMapping(value="/deletedocument/{docid}")
		public void deletedocument(@PathVariable("docid") int docid ,@RequestParam("custid") String data) throws IOException
		{	
			ObjectMapper om=new ObjectMapper();
			Document dd=om.readValue(data, Document.class);
			dd.setDocid(docid);
			se.deletedocument(dd);
			
		}
}


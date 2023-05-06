package com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model.Applicant;
import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model.Document;
import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.serviceInte.serviceInte;

@RestController
public class Homecontroller {
	@Autowired
	
	serviceInte se;
	
	@PostMapping(value="/savedata")
	public Applicant saveaaplicant(@RequestParam("applicantid") String data, 
			                       @RequestParam ("applicantresume") MultipartFile file4, 
			                       @RequestParam("eperienceletter") MultipartFile file5,
			                       @RequestParam("salleryslip") MultipartFile file6, 
			                       @RequestParam("privoiuscompanyletter") MultipartFile file7) throws IOException	
	{
	
		ObjectMapper om=new ObjectMapper();
		
		Applicant app = om.readValue(data, Applicant.class);
		
		Document d=new Document();
		app.setAppDoc(d);

		d.setApplicantresume(file4.getBytes());
		d.setEperienceletter(file5.getBytes());
		d.setSalleryslip(file6.getBytes());
		d.setPrivoiuscompanyletter(file7.getBytes());
		
		 return se.saveapplicant(app);	
	}
	@GetMapping(value="/getdata")
	public List<Applicant> getapplicant()
	{
		List<Applicant> appli=se.getapplicant();
		return appli;
	}
	
	@PutMapping(value="/updatedata/{applicantid}")
	public Applicant updateaaplicant(@RequestParam("applicantid") String data,
			                         @PathVariable("applicantid") int applicantid, 				                         
			                         @RequestParam ("applicantresume") MultipartFile file4, 
			                         @RequestParam("eperienceletter") MultipartFile file5,
	                                 @RequestParam("salleryslip") MultipartFile file6, 
	                                 @RequestParam("privoiuscompanyletter") MultipartFile file7) throws IOException	
		
	{

		Optional<Applicant> applicatOptional=se.getSingleApplicant(applicantid);
		if(applicatOptional.isPresent())
		{
		ObjectMapper om=new ObjectMapper();
		
		Applicant app = om.readValue(data, Applicant.class);
		
		app.setApplicantid(applicantid);
		
		Document d=new Document();
d.setDocumentid(applicatOptional.get().getAppDoc().getDocumentid());
		d.setApplicantresume(file4.getBytes());
		d.setEperienceletter(file5.getBytes());
		d.setSalleryslip(file6.getBytes());
		d.setPrivoiuscompanyletter(file7.getBytes());
		
		app.setAppDoc(d);
		
		 return se.saveapplicant(app);	
		}else {
			//thow aaplicantNotPresentException
			return null;
		}
		
		}
	
	@DeleteMapping(value="/deletedata/{applicantid}")
	public void deleteapplicant(@PathVariable int applicantid)
	{
		se.deleteapplicant(applicantid);
	}
}

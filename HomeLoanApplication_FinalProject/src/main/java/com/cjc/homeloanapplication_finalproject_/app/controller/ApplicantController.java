package com.cjc.homeloanapplication_finalproject_.app.controller;

import java.io.IOException;
import java.util.List;

import org.apache.el.parser.AstFalse;
import org.aspectj.apache.bcel.classfile.Module.Require;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanapplication_finalproject_.app.model.Applicant;
import com.cjc.homeloanapplication_finalproject_.app.model.ApplicantDocuments;
import com.cjc.homeloanapplication_finalproject_.app.model.CibilScore;
import com.cjc.homeloanapplication_finalproject_.app.model.PropertyDetails;
import com.cjc.homeloanapplication_finalproject_.app.servicei.ApplicantServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin("*")
@RestController
public class ApplicantController {

	@Autowired
	ApplicantServiceI asi;

	@PostMapping(value = "/insertApplicant")
	public Applicant addApplicant(@RequestParam(value="photo" ,required = false) MultipartFile file3,
			@RequestParam(value="pancard" ,required = false) MultipartFile file4, @RequestParam(value="adharcard",required = false) MultipartFile file5,
			@RequestParam(value="thumb" ,required = false) MultipartFile file6, @RequestParam(value="signature",required = false) MultipartFile file7,
			@RequestParam(value="bankcheque",required = false) MultipartFile file8, @RequestParam(value="incomeproof" ,required = false) MultipartFile file9,
			@RequestParam(value="bankstatement",required = false) MultipartFile file10, @RequestParam(value="ITR" ,required = false) MultipartFile file11,
			@RequestParam(value="form16" ,required = false) MultipartFile file12,
			@RequestParam(value="carporationPermissionLetter",required = false) MultipartFile file17, @RequestParam("appid") String data) throws IOException {
		ObjectMapper om1 = new ObjectMapper();
	
		ApplicantDocuments ad = new ApplicantDocuments();
		ad.setPhoto(file3.getBytes());
		ad.setPancard(file4.getBytes());
		ad.setAdharcard(file5.getBytes());
	
		ad.setSignature(file7.getBytes());
		ad.setBankcheque(file8.getBytes());
		ad.setIncomeproof(file9.getBytes());
		ad.setBankstatement(file10.getBytes());
		ad.setITR(file11.getBytes());
		ad.setForm16(file12.getBytes());

		

		CibilScore cs = new CibilScore();
		int max = 900;
		int min = 400;
		int b = (int) (Math.random() * (max - min + 1) + min);
	//	cs.setCibilcore(b);
		if (b <= 500) {
			cs.setCibilstatus("Not Satisied");
		} else if (b >= 500 && b <= 750) {
			cs.setCibilstatus("OK");
		} else if (b >= 750) {
			cs.setCibilstatus("Satisfied");
		}

		ObjectMapper om2 = new ObjectMapper();
		//PropertyDetails pd = om1.readValue(data2, PropertyDetails.class);
	

		// ApplicantAddress addr=new ApplicantAddress();
		// ProfessionalDetails pd=new ProfessionalDetails();
		// ApplicantBankDetails abd=new ApplicantBankDetails();

		ObjectMapper om = new ObjectMapper();
		Applicant aa = om.readValue(data, Applicant.class);
		// aa.setApplicantaddress(addr);
		// aa.setProfessionaldetails(pd);
		// aa.setAppbankdetails(abd);
		aa.getPropertydetails().setCarporationPermissionLetter(file17.getBytes());
		
		aa.setApplicantdocument(ad);
		//aa.setPropertydetails(pd);
		aa.setCibilscore(cs);
		
		return asi.saveApplicant(aa);
	}

	@GetMapping(value = "/GetAllApplicant")
	public List<Applicant> getAllData() {
		List<Applicant> list = asi.DisplayAllApplicant();
		return list;
	}

	@DeleteMapping(value = "/DeleteApplicant/{appid}")
	public String deleteApplicant(@PathVariable int appid) {
		asi.deleteApplicant(appid);
		return "Delete";
	}

}

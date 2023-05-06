package com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.serviceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model.Applicant;
import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.repository.repositoryi;
import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.serviceInte.serviceInte;

@Service
public class serviceImple implements serviceInte{

	
	@Autowired
	
	repositoryi re;
	
	@Override
	public Applicant saveapplicant(Applicant app) {
         app.getAppDoc().setDocumentid(31);
		return re.save(app);
	}

	@Override
	public List<Applicant> getapplicant() {
		
		return (List<Applicant>) re.findAll();
	}

	@Override
	public void deleteapplicant(int applicantid) {
		
		re.deleteById(applicantid);
		
	}

	@Override
	public Optional<Applicant> getSingleApplicant(int applicantid) {
		
		return re.findById(applicantid);
	}
	
	
	
	
	
}

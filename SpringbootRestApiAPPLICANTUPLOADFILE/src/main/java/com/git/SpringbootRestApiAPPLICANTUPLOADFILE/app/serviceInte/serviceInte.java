package com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.serviceInte;

import java.util.List;
import java.util.Optional;

import com.git.SpringbootRestApiAPPLICANTUPLOADFILE.app.model.Applicant;

public interface serviceInte {
	
   public Applicant saveapplicant(Applicant app);
   
   public List<Applicant> getapplicant();
   
   public void deleteapplicant(int  applicant);

public Optional<Applicant> getSingleApplicant(int applicantid);
   
   
}

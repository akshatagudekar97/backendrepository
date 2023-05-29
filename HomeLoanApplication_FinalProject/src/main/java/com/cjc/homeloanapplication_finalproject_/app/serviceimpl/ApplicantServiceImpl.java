package com.cjc.homeloanapplication_finalproject_.app.serviceimpl;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.buffer.DataBufferUtils.Matcher;
import org.springframework.stereotype.Service;

import com.cjc.homeloanapplication_finalproject_.app.exception.AdharcardNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.AgeNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.ContactNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.EmailNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.FirstNameNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.GenderNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.LastNameNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.MiddleNameNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.PancardNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.model.Applicant;
import com.cjc.homeloanapplication_finalproject_.app.repository.ApplicantRepository;
import com.cjc.homeloanapplication_finalproject_.app.servicei.ApplicantServiceI;

@Service
public class ApplicantServiceImpl implements ApplicantServiceI{
	
	@Autowired
	ApplicantRepository ar;

	@Override
	public Applicant saveApplicant(Applicant a) {
		
		
		if(Character.isUpperCase(a.getFirstname().charAt(0)))
		{
			if(Character.isUpperCase(a.getLastname().charAt(0)))
			{
				if(Character.isUpperCase(a.getMiddlename().charAt(0)))
				{
					if(a.getEmail().endsWith("@gmail.com"))
					{
						if((a.getAge()>=21)&&(a.getAge()<=55))
						{
							if(String.valueOf(a.getContactno()).length()==10)
							{
								  
								String s= a.getPancard();
								Pattern pattern=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
								java.util.regex.Matcher matcher=pattern.matcher(s);
								if( matcher.matches())
								{ 
									if(String.valueOf(a.getAdharcard()).length()==12)
									{ 
										//if(a.getGender().equals("male") || a.getGender().equals("female") && a.getGender().equals("Male") || a.getGender().equals("Female") )
										//{ 
									       Applicant aa = ar.save(a);
									       return a; 
										}
										//else
										//{
											//throw new GenderNotFoundException("Gender is Required male/female");
										//} 
									   // }
									else
									{
										throw new AdharcardNotFoundException("AdharCard 12 Digit Required");
									}
								}
								else
								{
									throw new PancardNotFoundException("PanCard 10 Digit Required ==>First 5 and  10 no.Letter UpperCase && 6,7,8,9=>Digit");
								} 

							} 
							else
							{
								throw new ContactNotFoundException("Contact Number 10 Digit Required");
							}  
						}
						else
						{
							throw new AgeNotFoundException("Age min 18");
						}
					}
					else
					{
						throw new EmailNotFoundException("Email is not required");
					}
				}
				else
				{
					throw new MiddleNameNotFoundException("MiddleName First Character is Uppercase");
				}
			}
			else
			{
				throw new LastNameNotFoundException("LastName First Character is Uppercase");
			}
		}
		else
		{
			throw new FirstNameNotFoundException("FirstName First Character is Uppercase");
		}
		
	//	return a; 
		
	}

	
	
	@Override
	public List<Applicant> DisplayAllApplicant() {
		List<Applicant> l=ar.findAll();
		return l;
	}



	@Override
	public void deleteApplicant(int appid) {
		ar.deleteById(appid);
		
	}



	




	

}

package com.cjc.homeloanapplication_finalproject_.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloanapplication_finalproject_.app.exception.AdharcardNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.AgeNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.ContactNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.EmailNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.FirstNameNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.LastNameNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.MiddleNameNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.exception.PancardNotFoundException;
import com.cjc.homeloanapplication_finalproject_.app.model.EnquiryDetails;
import com.cjc.homeloanapplication_finalproject_.app.repository.EnquiryDetailsRepository;
import com.cjc.homeloanapplication_finalproject_.app.servicei.EnquiryDetailsServiceI;



@Service
public class EnquiryDetailsServiceImpl implements EnquiryDetailsServiceI
{
	@Autowired
	EnquiryDetailsRepository edr;
	
	@Override
	public void saveEnquiryDetails(EnquiryDetails e)
	{
		
		if(Character.isUpperCase(e.getFirstname().charAt(0)))
		{
			if(Character.isUpperCase(e.getLastname().charAt(0)))
			{
				if(Character.isUpperCase(e.getMiddlename().charAt(0)))
				{
					if(e.getEmail().endsWith("@gmail.com"))
					{
						if((e.getAge()>=21)&&(e.getAge()<=55))
						{
							if(String.valueOf(e.getContactno()).length()==10)
							{
								 	if(toString().valueOf(e.getPancard()).length()==10 && Character.isUpperCase(e.getPancard().charAt(0)) &&
								 			Character.isUpperCase(e.getPancard().charAt(1))&&Character.isUpperCase(e.getPancard().charAt(2))
								 			&&Character.isUpperCase(e.getPancard().charAt(3))&&Character.isUpperCase(e.getPancard().charAt(4))
								 			   &&Character.isUpperCase(e.getPancard().charAt(9)))
								{ 
									if(String.valueOf(e.getAdharcard()).length()==12)
									{ 
									edr.save(e);
									}
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
	}

	@Override
	public List<EnquiryDetails> DisplayEnquiryDetails() {
	List<EnquiryDetails> l=edr.findAll();
		return l;
	}

}

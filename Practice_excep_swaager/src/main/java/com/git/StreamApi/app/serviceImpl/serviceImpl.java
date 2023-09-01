package com.git.StreamApi.app.serviceImpl;

import java.rmi.StubNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.git.StreamApi.app.exception.StudentNotFoundException;
import com.git.StreamApi.app.model.customer;
import com.git.StreamApi.app.repository.repository;
import com.git.StreamApi.app.serviceInt.serviceInt;

@Service
public class serviceImpl implements serviceInt{

	@Autowired
	
	repository re;
	
	@Override
	public customer save(customer c) {
		
		if(Character.isUpperCase(c.getCustname().charAt(0)) && c.getCustname().length()==15)
		{
		re.save(c);
		}
		else {

		throw new StudentNotFoundException("Starting Letter Is Capital and 15 digit in letter size");
		
		}
		return c;
	}

}

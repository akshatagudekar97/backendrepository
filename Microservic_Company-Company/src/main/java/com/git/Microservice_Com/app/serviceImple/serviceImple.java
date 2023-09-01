package com.git.Microservice_Com.app.serviceImple;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.Microservice_Com.app.exception.ResourceNotFoundException;
import com.git.Microservice_Com.app.model.Company;
import com.git.Microservice_Com.app.repository.repository;
import com.git.Microservice_Com.app.service.serviceInt;
@Service
public class serviceImple implements serviceInt{

	
	@Autowired
	repository re;
	
	@Override
	public Company create(Company c) {
		
		String randomid=UUID.randomUUID().toString();
		c.setCid(randomid);
		
		if(Character.isUpperCase(c.getName().charAt(0)))
		{
		return re.save(c);
		}
		else {
			 throw new ResourceNotFoundException("First Letter is always be Capital");
		}
	}

	@Override
	public List<Company> get() {
		
		return re.findAll();
	}

	@Override
	public Company search(String cid) {
		return re.findByCid(cid);
	}

	@Override
	public Company delete(Company cid) {
		
		re.delete(cid);
		return cid;
		
		
	}

	
}

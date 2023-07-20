package com.git.StreamApi.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.git.StreamApi.app.model.customer;
import com.git.StreamApi.app.repository.repository;
import com.git.StreamApi.app.serviceInt.serviceInt;

@Service
public class serviceImpl implements serviceInt{

	@Autowired
	
	repository re;
	
	@Override
	public void save(customer c) {
		re.save(c);
	}

}

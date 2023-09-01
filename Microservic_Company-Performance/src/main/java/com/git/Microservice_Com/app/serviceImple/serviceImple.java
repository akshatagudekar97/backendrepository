package com.git.Microservice_Com.app.serviceImple;

import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.Microservice_Com.app.model.Performance;
import com.git.Microservice_Com.app.repositoryinter.repository;
import com.git.Microservice_Com.app.serviceinter.serviceInter;

@Service
public class serviceImple implements serviceInter{

	@Autowired
	repository re;
	
	
	@Override
	public Performance create(Performance perform) {
		
		String randomid=UUID.randomUUID().toString();
		perform.setId(randomid);
		
		return re.save(perform);
	}

	@Override
	public List<Performance> getPerformance() {

		return re.findAll();
	}

	@Override
	public List<Performance> getEmployeeId(String empid) {
		
		return re.findByEmpid(empid);
	}

	@Override
	public List<Performance> getcompanyid(String cid) {

		return re.findByCid(cid);
	}

	
}

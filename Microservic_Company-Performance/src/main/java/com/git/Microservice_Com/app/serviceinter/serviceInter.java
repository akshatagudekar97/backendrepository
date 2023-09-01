package com.git.Microservice_Com.app.serviceinter;

import java.util.List;

import com.git.Microservice_Com.app.model.Performance;


public interface serviceInter {

	public Performance create(Performance perform);
	
	public List<Performance> getPerformance();
	
	public List<Performance> getEmployeeId(String empid);
	
	public List<Performance> getcompanyid(String cid);
}

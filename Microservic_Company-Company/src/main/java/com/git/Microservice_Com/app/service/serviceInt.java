package com.git.Microservice_Com.app.service;

import java.util.List;

import com.git.Microservice_Com.app.model.Company;

public interface serviceInt {

	public Company create(Company c);
	public List<Company> get();
	public Company search(String cid);
	
	public  Company delete(Company cid);
}

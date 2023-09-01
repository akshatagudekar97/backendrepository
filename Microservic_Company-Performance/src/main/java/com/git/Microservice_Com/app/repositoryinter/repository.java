package com.git.Microservice_Com.app.repositoryinter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.git.Microservice_Com.app.model.Performance;


@Repository
public interface repository  extends JpaRepository<Performance, String>{

	public List<Performance> findByEmpid(String empid);
	public List<Performance> findByCid(String cid);
	
	
}

package com.git.Microservice_Com.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.git.Microservice_Com.app.model.Company;
@Repository
public interface repository extends JpaRepository<Company,String >{

	public Company findByCid(String  cid);

}

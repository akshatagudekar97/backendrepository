package com.cjc.homeloanapplication_finalproject_.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ledger extends CrudRepository<Ledger, Integer>{
	

}

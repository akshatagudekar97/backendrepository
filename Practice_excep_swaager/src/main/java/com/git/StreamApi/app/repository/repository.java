package com.git.StreamApi.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.StreamApi.app.model.customer;

@Repository
public interface repository extends CrudRepository<customer, Integer>{

}

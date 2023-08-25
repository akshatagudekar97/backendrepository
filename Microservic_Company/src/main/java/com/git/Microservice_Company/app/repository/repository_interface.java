package com.git.Microservice_Company.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.Microservice_Company.app.User.Employee;

@Repository
public interface repository_interface extends CrudRepository<Employee,Integer>{

	public List<Employee> findByEmpid(int empid);
}

package com.git.WebserviceCrudGitHub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.git.WebserviceCrudGitHub.model.Student;

@Repository
public interface repository extends CrudRepository<Student,Integer>{

}

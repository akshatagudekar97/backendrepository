package com.cjc.homeloanapplication_finalproject_.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloanapplication_finalproject_.app.model.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Integer>{

}

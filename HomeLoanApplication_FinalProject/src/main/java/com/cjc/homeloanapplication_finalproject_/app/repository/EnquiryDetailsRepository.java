package com.cjc.homeloanapplication_finalproject_.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloanapplication_finalproject_.app.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer>{

}

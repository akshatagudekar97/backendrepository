package com.git.Microservice_Company.app.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.git.Microservice_Company.app.User.Company;

@FeignClient(name="companyService")
public interface CompanyService {

	   @GetMapping("/Company/{cid}")
	 Company getCompany(@PathVariable String cid);
	
}
       
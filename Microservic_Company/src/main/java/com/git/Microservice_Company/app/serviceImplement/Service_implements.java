package com.git.Microservice_Company.app.serviceImplement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.git.Microservice_Company.app.User.Company;
import com.git.Microservice_Company.app.User.Employee;
import com.git.Microservice_Company.app.User.Performance;
import com.git.Microservice_Company.app.exception.EmployeeNotFoundException;
import com.git.Microservice_Company.app.external.CompanyService;
import com.git.Microservice_Company.app.repository.repository_interface;
import com.git.Microservice_Company.app.serviceinterface.Service_Inteface;

@Service
public class Service_implements implements Service_Inteface {

	@Autowired
	repository_interface re;

	@Autowired
	private CompanyService companyService;

	@Autowired
	private RestTemplate restTem;

	private Logger logg = LoggerFactory.getLogger(Service_implements.class);

	@Override
	public Employee saveEmp(Employee emp) {
		if (Character.isUpperCase(emp.getEmpname().charAt(0))) {
			Employee e = re.save(emp);
			return e;
		} else {
			throw new EmployeeNotFoundException("Spell Is  Not Corrrect");
		}
	}

	@Override
	public Iterable<Employee> getEmp() {
		Iterable<Employee> list = re.findAll();

		return list;
	}

	@Override
	public Employee searchEmp(int empid) {

		Employee list = re.findByEmpid(empid);

		// fetch performance of the above user
		// http://localhost:8083/performance/Employee/2"

		Performance[] rest = restTem.getForObject("http://PERFORMANCE/performance/Employee/" + list.getEmpid(),
				Performance[].class);

		logg.info("{}", rest);

		List<Performance> p = Arrays.stream(rest).toList();

		List<Performance> perlist = p.stream().map(perform -> {

			/*
			 * ResponseEntity<Company> forentity =
			 * restTem.getForEntity("http://COMPANY/Company/" + perform.getCid(),
			 * Company.class);
			 * 
			 * Company compa = forentity.getBody();
			 * 
			 * logg.info("reponse Status code: {} ", forentity.getStatusCode());
			 */
			 Company compa=companyService.getCompany(perform.getCid());

			perform.setCompany(compa);

			return perform;
		}).collect(Collectors.toList());

		list.setPerform(perlist);
		return list;
	}

	@Override
	public void deleteEmp(Employee emp) {
		re.delete(emp);
	}

}

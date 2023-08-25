package com.git.Microservice_Company.app.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.Microservice_Company.app.User.Employee;
import com.git.Microservice_Company.app.exception.EmployeeNotFoundException;
import com.git.Microservice_Company.app.repository.repository_interface;
import com.git.Microservice_Company.app.serviceinterface.Service_Inteface;

@Service
public class Service_implements implements Service_Inteface{

	@Autowired
	repository_interface re;

	@Override
	public Employee saveEmp(Employee emp) {
		if(Character.isUpperCase(emp.getEmpname().charAt(0)))
		{
	Employee e =re.save(emp);
		return e;
		}
		else {
			throw new EmployeeNotFoundException("Spell Is  Not Corrrect");
		}
	}

	@Override
	public Iterable<Employee> getEmp() {
		Iterable<Employee> list=re.findAll();
		
		return list;
	}

	@Override
	public List<Employee> searchEmp(int empid) {

		List<Employee> list= re.findByEmpid(empid);
		return list;
	}

	@Override
	public void deleteEmp(Employee emp) {
		re.delete(emp);
	}
	
}

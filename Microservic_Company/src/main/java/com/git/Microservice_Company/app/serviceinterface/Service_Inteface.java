package com.git.Microservice_Company.app.serviceinterface;

import java.util.List;

import com.git.Microservice_Company.app.User.Employee;

public interface Service_Inteface {

	public Employee saveEmp(Employee emp);
	
	public Iterable<Employee> getEmp();
	
	public List<Employee> searchEmp(int empid);
	
	public void deleteEmp(Employee emp);
}

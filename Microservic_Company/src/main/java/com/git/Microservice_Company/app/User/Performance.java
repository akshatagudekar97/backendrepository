package com.git.Microservice_Company.app.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Performance {
 
	private String id;
	private String empid;
	private String cid;
	private String performancestar;
	private String remark;
	private String feedback;
	
	private Company company;
}

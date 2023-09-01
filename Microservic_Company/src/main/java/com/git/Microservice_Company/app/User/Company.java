package com.git.Microservice_Company.app.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Company {

	    private String cid;
		private String name;
		private String location;
		private String about;
		
}

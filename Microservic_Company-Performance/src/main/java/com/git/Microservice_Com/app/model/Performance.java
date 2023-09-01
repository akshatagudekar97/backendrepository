package com.git.Microservice_Com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Performance")
public class Performance {	
	
		@Id
		private String id;
		private String empid;
		private String cid;
		private String performancestar;
		private String remark;
		private String feedback;
	}


package com.git.StreamApi.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class customer {

	@Id
	
	private int custid;
	private String custname;
	private String custaddr;
	private long custmobno;
	
}

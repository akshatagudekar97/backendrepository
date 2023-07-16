package com.git.User.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class student {

	@Id

	private int id;
	private String name;
	
}

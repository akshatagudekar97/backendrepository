package com.git.WebserviceCrudGitHubException.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	
	@Id
	private Integer productId;
	private String productName;
	private String productprice;
}

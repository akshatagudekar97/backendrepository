package com.git.WebserviceCrudGitHubException.app.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.WebserviceCrudGitHubException.app.esrviceI.serviceInte;
import com.git.WebserviceCrudGitHubException.app.exception.ProductNotFoundException;
import com.git.WebserviceCrudGitHubException.app.model.Product;
import com.git.WebserviceCrudGitHubException.app.repository.RepositoryExce;

@Service
public class ServiceImple implements serviceInte{
	@Autowired
	
	RepositoryExce re;
	
	
	@Override
	public void saveproduct(Product pr) {
		
		re.save(pr);
	}


	@Override
	public List<Product> getproduct() {
		List<Product> list=(List<Product>) re.findAll();
		return list;
	}


	@Override
	public void deleteproduct(Product pr) {
		re.delete(pr);
		
	}
	@Override
	public List<Product> searchproduct(String productName) {
		
		 List<Product> product=re.findByProductName(productName);
		
		if(product!=null)
		{
		
		return product;
		}
		else
		{
			throw new ProductNotFoundException("Product Not Availabe");
		}
	}

}

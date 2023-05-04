package com.git.WebserviceCrudGitHubException.app.esrviceI;

import java.util.List;

import com.git.WebserviceCrudGitHubException.app.model.Product;

public interface serviceInte {
	public void saveproduct(Product pr);
	public List<Product> getproduct();
	
	public void deleteproduct(Product pr);
	public List<Product> searchproduct(String productName);
}

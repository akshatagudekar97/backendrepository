package com.git.WebserviceCrudGitHubException.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.WebserviceCrudGitHubException.app.model.Product;

@Repository
public interface RepositoryExce extends CrudRepository<Product,Integer>{
	public List<Product> findByProductName(String productName);
}

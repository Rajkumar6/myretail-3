package com.myretail.dao;

import java.util.ArrayList;

import com.myretail.model.Product;

public interface ProductDao {
	
	public Product getProduct(String productId);
	
	public ArrayList<Product> getAllProducts();
	
	public void saveProduct(Product product);
	
	public void updateProduct(Product product);

}

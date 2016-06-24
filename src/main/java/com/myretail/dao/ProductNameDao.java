package com.myretail.dao;

import java.util.ArrayList;

import com.myretail.domain.ProductName;

public interface ProductNameDao {
	
	public void saveProductName(ProductName productName);
	
	public void updateProductName(ProductName productName);
	
	public void deleteProductName(ProductName productName);
	
	public ProductName getProductName(String productId);
	
	public ArrayList<ProductName> getAllProductNames();

}

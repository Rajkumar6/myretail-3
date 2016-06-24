package com.myretail.business;

import java.util.ArrayList;

import com.myretail.domain.ProductName;
import com.myretail.model.Result;

public interface ProductNameBo {
	
	public Result saveProductName(ProductName productName);
	
	public Result updateProductName(ProductName productName);
	
	public Result deleteProductName(ProductName productName);
	
	public ProductName getProductName(ProductName productName);
	
	public ArrayList<ProductName> getAllProductNames();

}

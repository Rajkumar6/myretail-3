package com.myretail.business;

import com.myretail.domain.ProductName;
import com.myretail.model.Result;

public interface ProductNameBo {
	
	public Result saveProductName(ProductName productName);
	
	public Result updateProductName(ProductName productName);
	
	public Result deleteProductName(ProductName productName);
	
	public Result getProductName(ProductName productName);
	
	public Result getAllProductNames();

}

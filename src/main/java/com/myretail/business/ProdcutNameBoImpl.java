package com.myretail.business;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.dao.ProductNameDao;
import com.myretail.domain.ProductName;
import com.myretail.model.Result;

@Service
public class ProdcutNameBoImpl implements ProductNameBo {

	@Autowired
	private ProductNameDao productNameDao;
	@Resource(name="successResultBean")
	private Result successResult;
	@Resource(name="errorResultBean")
	private Result errorResult;
	
	
	
	@Override
	public Result saveProductName(ProductName productName) {
		try{
		productNameDao.saveProductName(productName);
		return successResult;
		}catch(Exception e){
			e.printStackTrace();
			return errorResult;
		}
	}

	@Override
	public Result updateProductName(ProductName productName) {
		return null;
	}

	@Override
	public Result deleteProductName(ProductName productName) {
		return null;
	}

	@Override
	public ProductName getProductName(String productId) {
		return null;
	}

	@Override
	public ArrayList<ProductName> getAllProductNames() {
		return null;
	}
	
	

}

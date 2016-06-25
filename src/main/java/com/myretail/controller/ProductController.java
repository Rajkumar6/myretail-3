package com.myretail.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.model.Product;
import com.myretail.model.Result;

@RestController
@RequestMapping("/products")
public class ProductController {

	@RequestMapping(value="/{productId}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable String productId){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ArrayList<Product> getAllProducts(){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Result saveProduct(@RequestBody Product product){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Result updateProduct(@RequestBody Product product){
		return null;
	}
	
	
}

package com.myretail.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.model.Result;

@RestController
public class ProductController {

	@RequestMapping(value="/product", method=RequestMethod.POST)
	public Result saveProductName(){
		return null;
	}
	
	
}

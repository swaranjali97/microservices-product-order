package com.microservices.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.inventory.service.InventoryServiceImpl;

@RestController
public class InventoryController {

	@Autowired
	private InventoryServiceImpl srv;
	
	@GetMapping("/isavailable/{skuCode}")
	public Boolean isavailable(@PathVariable  Integer skuCode) {
		String result="";
		boolean rslt=srv.isavailable(skuCode);
		return rslt;
//		if(rslt)
//			return "Product is available";
//		else
//				return "Product not available";
		
	}
}

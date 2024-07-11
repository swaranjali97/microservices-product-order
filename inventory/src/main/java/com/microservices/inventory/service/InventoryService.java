package com.microservices.inventory.service;

import org.springframework.web.bind.annotation.RequestBody;

public interface InventoryService {

	
	public boolean isavailable(  Integer skuCode);
}
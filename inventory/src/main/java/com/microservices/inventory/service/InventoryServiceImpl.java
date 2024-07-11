package com.microservices.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.inventory.dao.InventoryDao;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryDao dao;

	@Override
	public boolean isavailable(Integer skuCode) {
		return dao.findBySkuCode( skuCode).isPresent();
	}
	
}

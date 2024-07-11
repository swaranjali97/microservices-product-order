package com.microservices.inventory.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.inventory.pojo.Inventory;

public interface InventoryDao extends JpaRepository<Inventory, Integer> {

	Optional<Inventory> findBySkuCode(Integer skuCode);
	
	
	
}
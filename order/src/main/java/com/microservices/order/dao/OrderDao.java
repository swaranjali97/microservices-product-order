package com.microservices.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.order.pojo.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

	
}

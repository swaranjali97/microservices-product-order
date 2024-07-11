package com.microservices.order.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.order.pojo.OrderItemList;

public interface OrderService {

	
	public String placeOrder( List<OrderItemList> orderRequest) throws Exception ;
	
}
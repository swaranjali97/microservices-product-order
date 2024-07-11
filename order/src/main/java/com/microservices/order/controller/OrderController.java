package com.microservices.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.order.pojo.OrderItemList;
import com.microservices.order.service.OrderServiceImpl;

@RestController
public class OrderController {
	@Autowired
	private OrderServiceImpl srv;
	
	@PostMapping("/placeorder")
	public String placeOrder(@RequestBody List<OrderItemList> orderRequest) throws Exception {
		return srv.placeOrder(orderRequest);
	}
	
	
}

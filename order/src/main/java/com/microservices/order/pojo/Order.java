package com.microservices.order.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer orderNum;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "order", orphanRemoval = true)
	private List<OrderItemList> orderList=new ArrayList<>();
	
	public Order() {
		
	}
	public Order(Integer id, Integer orderNum, List<OrderItemList> orderList) {
		super();
		this.id = id;
		this.orderNum = orderNum;
		this.orderList = orderList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public List<OrderItemList> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderItemList> orderList) {
		this.orderList = orderList;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNum=" + orderNum + ", orderList=" + orderList + "]";
	}
	
	
	

}

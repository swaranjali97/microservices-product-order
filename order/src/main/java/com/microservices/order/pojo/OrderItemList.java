package com.microservices.order.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "OrderItemList")
public class OrderItemList {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer skucode;
	private Double price;
	private Integer quantity;
	
	@ManyToOne
	private Order order;
	
public OrderItemList() {
	
}
	public OrderItemList(Integer id, Integer skucode, Double price, Integer quantity) {
		super();
		this.id = id;
		this.skucode = skucode;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSkucode() {
		return skucode;
	}
	public void setSkucode(Integer skucode) {
		this.skucode = skucode;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", skucode=" + skucode + ", price=" + price + ", quantity=" + quantity + "]";
	}
}

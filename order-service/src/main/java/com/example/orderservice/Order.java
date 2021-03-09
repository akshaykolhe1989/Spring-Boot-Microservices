package com.example.orderservice;

public class Order {
	
	private int orderId;
	private String orderName;
	private int customerId;
	public Order(int orderId, String orderName, int customerId) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.customerId = customerId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
}

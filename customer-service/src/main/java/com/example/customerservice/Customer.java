package com.example.customerservice;

public class Customer {
	
	
	private int customerId;
	private String customerName;
	private int orderId;
	public Customer(int customerId, String customerName, int orderId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
}

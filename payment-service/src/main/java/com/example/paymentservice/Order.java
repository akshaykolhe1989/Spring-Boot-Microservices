package com.example.paymentservice;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Component
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, 
property = "@id", scope = Order.class)
public class Order {
	
	private int orderId;
	private String orderName;
	private int customerId;
	private boolean paymentDone;
	
	
	/*
	 * public Order(int orderId, String orderName, int customerId, boolean
	 * paymentDone) { super(); this.orderId = orderId; this.orderName = orderName;
	 * this.customerId = customerId; this.paymentDone = paymentDone; }
	 */
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
	public boolean isPaymentDone() {
		return paymentDone;
	}
	public void setPaymentDone(boolean paymentDone) {
		this.paymentDone = paymentDone;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", customerId=" + customerId
				+ ", paymentDone=" + paymentDone + "]";
	}
	
	
}

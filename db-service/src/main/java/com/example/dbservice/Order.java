package com.example.dbservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "orderid")
	private int orderId;
	
	@Column(name = "ordername")
	private String orderName;
	
	@Column(name = "customerid")
	private int customerId;
	
	@JsonInclude
	@Transient
	private boolean paymentDone;
	
	@Column(name = "paymentsuccess")
	private int paymentSuccess;
	
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
	public int getPaymentSuccess() {
		return paymentSuccess;
	}
	public void setPaymentSuccess(int paymentSuccess) {
		this.paymentSuccess = paymentSuccess;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", customerId=" + customerId
				+ ", paymentDone=" + paymentDone + ", paymentSuccess=" + paymentSuccess + "]";
	}
	
	
	
}

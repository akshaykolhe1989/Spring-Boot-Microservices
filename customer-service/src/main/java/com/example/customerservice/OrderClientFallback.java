package com.example.customerservice;

import java.util.Collections;

import org.springframework.stereotype.Component;

@Component
public class OrderClientFallback implements OrderClient {

	@Override
	public Object getCustomerOrders(int customerId) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

}

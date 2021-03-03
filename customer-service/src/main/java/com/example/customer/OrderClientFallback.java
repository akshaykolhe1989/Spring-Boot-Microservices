package com.example.customer;

import java.util.Collections;

import org.springframework.stereotype.Component;

@Component
public class OrderClientFallback implements OrderClient {

	@Override
	public Object getOrdersForCustomer(int customerId) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

}

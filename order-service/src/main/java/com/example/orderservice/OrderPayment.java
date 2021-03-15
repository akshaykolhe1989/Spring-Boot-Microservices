package com.example.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-service", decode404 = true)
public interface OrderPayment {
	
	@PostMapping("/")
	Object paymentProcessing(@RequestBody Order order);
}

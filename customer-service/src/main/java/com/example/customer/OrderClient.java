package com.example.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-service", decode404=true, fallback = OrderClientFallback.class)
public interface OrderClient {
	
	@GetMapping("/")
    Object getOrdersForCustomer(@RequestParam("id") int customerId);

}

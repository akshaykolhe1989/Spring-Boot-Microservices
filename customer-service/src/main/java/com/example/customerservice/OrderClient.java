package com.example.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "order-service", decode404 = true, fallback = OrderClientFallback.class)
//@FeignClient(name = "order-service", decode404 = true,  configuration = OrderFeignConfiguration.class)
//@FeignClient(name = "order-service", decode404 = true, fallback = OrderClientFallback.class)
public interface OrderClient {

	@GetMapping("/")
	public Object getCustomerOrders(@RequestParam("customerId") int customerId);
}

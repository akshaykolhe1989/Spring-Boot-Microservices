package com.example.orderservice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	private final List<Order> orders = Arrays.asList(
			
				new Order(101,"Prod 1",1),
				new Order(102,"Prod 2",1),
				new Order(103,"Prod 3",3),
				new Order(104,"Prod 4",3),
				new Order(105,"Prod 5",5)
			);
	
	
	private Environment environment;
	
	public OrderController(Environment environment) {
		super();
		this.environment = environment;
	}


	/*@GetMapping
	public List<Order> getOrders(){
		
		return orders;
	} */
	
	
	@GetMapping("/{orderId}")
	public List<Order> getOrder(@PathVariable Integer orderId) {
		
		if(orderId!=null)
			return orders.stream()
					.filter(order -> orderId.equals(order.getOrderId()))
					.collect(Collectors.toList());
		
		return orders;
	}
	
	
	//Via OpenFeign
	
	/*@GetMapping
	public List<Order> getCustomerOrders(@RequestParam(name = "customerId", required = false) Integer customerId){
		
		if(customerId!=null)
			return orders.stream()
					.filter(order -> customerId.equals(order.getCustomerId()))
					.collect(Collectors.toList());
		
			return orders;
			
	} */
	
	// Via Feign (implicitly uses Ribbon) load balancing
	@GetMapping
	public ResponseWrapper<List<Order>> getCustomerOrders(@RequestParam(name = "customerId", required = false) Integer customerId){
		
		if(customerId!=null)
			return new ResponseWrapper<List<Order>>(environment,orders.stream()
					.filter(order -> customerId.equals(order.getCustomerId()))
					.collect(Collectors.toList()));
		
			return new ResponseWrapper<List<Order>>(environment,orders);
			
	} 
	
}

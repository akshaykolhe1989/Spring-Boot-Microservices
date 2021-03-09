package com.example.customerservice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	
	private final List<Customer> customers= Arrays.asList(
			
				new Customer(1, "Peter", 101),
				new Customer(2, "Pamela", 102),
				new Customer(3, "Jason", 103),
				new Customer(4, "James", 104),
				new Customer(5, "Terry", 105)

			);
	
	private OrderClient orderClient;
	
	public CustomerController(OrderClient orderClient) {
		super();
		this.orderClient = orderClient;
	}

	@GetMapping
	public List<Customer> getCustomers(){
		return customers;
	}
	
	@GetMapping("/{customerId}")
	public List<Customer> getCustomer(@PathVariable Integer customerId){
		
		if(customerId!=null)
		return customers.stream()
				.filter(customer -> customerId.equals(customer.getCustomerId()))
				.collect(Collectors.toList())
				;
		
		
		return customers;
	}
	
	
	@GetMapping("/{customerId}/orders")
	public Object getCustomerOrders(@PathVariable Integer customerId) {
		return orderClient.getCustomerOrders(customerId);
	}
	
}

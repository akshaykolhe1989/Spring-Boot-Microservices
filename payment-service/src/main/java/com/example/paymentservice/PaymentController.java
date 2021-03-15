package com.example.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	private Environment environment;
	
	@Value("${app.message}")
	private String message;
	
	@Autowired
	private RabbitMqService<Order> rabbitMqService;

	public PaymentController(Environment environment) {
		super();
		this.environment = environment;
	}


	@PostMapping
	public ResponseWrapper<String> paymentProcessing(@RequestBody Order order){
		
		order.setPaymentDone(true);
		
		String message = pushToRabbitMQ(order);
		
		return new ResponseWrapper<String>(environment, "Payment received successfully for orderId "+order.getOrderId()+". "+ message);
		
	}


	private String pushToRabbitMQ(Order order) {
		System.out.println("Pushing to Rabbit MQ ********************");
		rabbitMqService.send(order);
		return message;
		
	}
	
	
	
}

package com.example.paymentservice;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService<T> {
	
	@Value("${spring.rabbitmq.exchange}")
    private String exchange;
    
    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;
    
    private RabbitTemplate rabbitTemplate;

    @Autowired
	public RabbitMqService(RabbitTemplate rabbitTemplate) {
		super();
		this.rabbitTemplate = rabbitTemplate;
	}
    
    public void send(T t){
        rabbitTemplate.convertAndSend(exchange,routingkey, t);
    }
    
}

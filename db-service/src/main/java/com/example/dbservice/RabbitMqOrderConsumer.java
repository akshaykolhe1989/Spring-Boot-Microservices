package com.example.dbservice;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqOrderConsumer implements RabbitListenerConfigurer{
	
	private static final Logger logger = LoggerFactory.getLogger(RabbitMqOrderConsumer.class);
	
	OrderRepository orderRepository;
	
	@Autowired
	public RabbitMqOrderConsumer(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	

	@Override
	public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	@RabbitListener(queues = "${spring.rabbitmq.queue}")
	public void receiveFromRabbitMq(Order order){
		logger.info("User Details Received is.. " + order);
		
		if(order.isPaymentDone()) order.setPaymentSuccess(1);
		else order.setPaymentSuccess(0);
		
		orderRepository.save(order);
	}

}

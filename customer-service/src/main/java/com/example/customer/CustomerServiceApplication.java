package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

/*
* Adjust load balancing rule by openFeign (Internal uses Ribbon) in spring cloud. 
* Below we have configured to use Random Rule for Load balancing within CloudProviderConfiguration class.
* By default if not provided, openFeign (Internal uses Ribbon) uses Round Robbin Rule for Load balancing.
*/
//@RibbonClients({@RibbonClient(name="order-service", configuration = CloudProviderConfiguration.class)})  

public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}

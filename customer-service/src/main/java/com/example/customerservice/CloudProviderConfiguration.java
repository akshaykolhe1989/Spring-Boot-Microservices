package com.example.customerservice;

import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/*Referred by RibbonClients annotation in CustomerServiceApplication class*/

public class CloudProviderConfiguration {
	
	/*
	 * Adjust load balancing rule by openFeign (Internal uses Ribbon) in spring cloud. Below we have configured to use Random Rule for Load balancing
	 * By default if not provided, openFeign (Internal uses Ribbon) uses Round Robbin Rule for Load balancing
	 */
	
	@Bean
	public IRule ribbonRule(IClientConfig iClientConfig) {
		return new RandomRule();
	}

}

package com.example.customerservice;

import org.apache.http.entity.ContentType;
import feign.RequestInterceptor;
import feign.RequestTemplate;


public class FeignInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate template) {
		// TODO Auto-generated method stub
		template.header("user", "Akshay");
		template.header("password", "PASS");
		template.header("Accept", ContentType.APPLICATION_JSON.getMimeType());

	}

}

package com.example.customerservice;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.form.ContentType;



public class FeignInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate template) {
		// TODO Auto-generated method stub
		template.header("user", "Akshay");
		template.header("password", "PASS");
		template.header("Accept", "application/json");

	}

}

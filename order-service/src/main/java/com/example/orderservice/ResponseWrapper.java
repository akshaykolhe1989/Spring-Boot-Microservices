package com.example.orderservice;

import org.springframework.core.env.Environment;

public class ResponseWrapper<T> {
	
	private int port;
	private T data;
	public ResponseWrapper(Environment environment, T data) {
		super();
		String port = environment!=null ? environment.getProperty("server.port"):"";
		
		System.out.println("******************"+port);
		
		this.port = port.isEmpty()? null:Integer.parseInt(port);
		
		System.out.println("******************"+port);
		
		this.data = data;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
	
	

}

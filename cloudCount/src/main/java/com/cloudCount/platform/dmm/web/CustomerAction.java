package com.cloudCount.platform.dmm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloudCount.platform.dmm.service.CustomerService;

public class CustomerAction {
	
	// @Autowired
	public CustomerService customerService;
	
	public String sayHello(String name){
		return customerService.sayHello(name);
	};

	public List getUsers(){
		return customerService.getUsers();
	};


}

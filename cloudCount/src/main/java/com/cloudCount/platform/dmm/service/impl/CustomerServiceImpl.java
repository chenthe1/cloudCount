package com.cloudCount.platform.dmm.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cloudCount.platform.dmm.model.Customer;
import com.cloudCount.platform.dmm.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List getUsers() {
		List list = new ArrayList();
		Customer u1 = new Customer();
		u1.setName("jack");
		u1.setAge(20);
		u1.setSex("m");

		Customer u2 = new Customer();
		u2.setName("tom");
		u2.setAge(21);
		u2.setSex("m");

		Customer u3 = new Customer();
		u3.setName("rose");
		u3.setAge(19);
		u3.setSex("w");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}
}

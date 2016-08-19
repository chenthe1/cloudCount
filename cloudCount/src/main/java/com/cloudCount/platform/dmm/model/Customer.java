package com.cloudCount.platform.dmm.model;

public class Customer {
	private int age;
	private String name;
	private String sex;

	public Customer() {
		super();
	}

	public Customer(int age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}

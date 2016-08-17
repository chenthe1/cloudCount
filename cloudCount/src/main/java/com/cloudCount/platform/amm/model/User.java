package com.cloudCount.platform.amm.model;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * serial Version UID
	 */
	private static final long serialVersionUID = 6424646603064118531L;

	/**
	 * user ID
	 */
	private Integer id;

	/**
	 * name
	 */
	private String userName;

	/**
	 * userPassword
	 */
	private String userPassword;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}

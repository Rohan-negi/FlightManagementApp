package com.flyersInc.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Users {

	private String name;
	private String email;
	private int mobileNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}

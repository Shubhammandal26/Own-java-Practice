package com.whatsapp.message;

import java.io.Serializable;

public class Employee implements Serializable
{

	private static final long serialVersionUID = 1L;
	String message;
	String address;
	
	public Employee(String message, String address) {
		super();
		this.message = message;
		this.address = address;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}

package com.whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	String message;

	public Message(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

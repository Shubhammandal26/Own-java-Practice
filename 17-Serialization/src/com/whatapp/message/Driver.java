package com.whatapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException 
	{
		
		MessageSender messageSender = new MessageSender();
		
		Message message = new Message("MSG1", "What are u doing?");
		messageSender.serializeMsg(message);

	}

}

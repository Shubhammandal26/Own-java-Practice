package com.whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException 
	{
		
		MessageSender  messageSender = new MessageSender();
		Employee emp = new Employee("Are celebrating Diwali", "Bangalore");
		messageSender.serializedMsg(emp);
		

	}

}

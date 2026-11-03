package com.whatapp.message;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSender 
{
	public void serializeMsg(Message message) throws IOException
	{
		FileOutputStream fio = new FileOutputStream("message.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fio);
		
		oos.writeObject(message);
		oos.close();
		
	}

}

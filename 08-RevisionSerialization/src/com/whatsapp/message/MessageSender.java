package com.whatsapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSender 
{
	public void serializedMsg(Employee emp) throws IOException
	{
		FileOutputStream fio = new FileOutputStream("message.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fio);
		
		oos.writeObject(emp);
		 oos.close();
	}

}

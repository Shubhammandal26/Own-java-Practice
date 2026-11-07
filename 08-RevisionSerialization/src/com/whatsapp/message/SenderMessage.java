package com.whatsapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SenderMessage 
{
	public void serializableMessage(Message message) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("information.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
	  oos.writeObject(message);
	  oos.close();
	}

}

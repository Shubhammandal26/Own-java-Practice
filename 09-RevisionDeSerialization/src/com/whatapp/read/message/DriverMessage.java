package com.whatapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Message;

public class DriverMessage {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\Kodewala\\\\Learning-Java\\\\08-RevisionSerialization//information.ser");
		ObjectInputStream oos = new ObjectInputStream(fis);
		
	Message message	= (Message) oos.readObject();
	System.out.println("De Serialize: " + message.getMessage());

	}

}

package com.whatapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Employee;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\shubh\\OneDrive\\Documents\\Kodewala\\Learning-Java\\08-RevisionSerialization//message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
	Employee emp = (Employee) ois.readObject();
	System.out.println("De Serialization: " + emp.getMessage());
		

	}

}

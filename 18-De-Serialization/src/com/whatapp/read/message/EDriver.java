package com.whatapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatapp.message.Employee;

public class EDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	  FileInputStream fis = new FileInputStream("C:\\Users\\shubh\\OneDrive\\Documents\\Kodewala\\Learning-Java\\01-Serialization\\employee.ser");
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  
	  Employee employee = (Employee) ois.readObject();
	  System.out.println("De Ser: " + employee.getUserName());
	  System.out.println("De Ser: " + employee.getRollNo());
	  
	  

	}

}

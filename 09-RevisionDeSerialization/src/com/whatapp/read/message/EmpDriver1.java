package com.whatapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Employee1;

public class EmpDriver1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\shubh\\OneDrive\\Documents\\Kodewala\\Learning-Java\\08-RevisionSerialization//Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee1 employee = (Employee1) ois.readObject();
		
		System.out.println("De Serialize: " + employee.getAddress()); // null
		System.out.println("De Serialize: " + employee.getEmployeeId());
		System.out.println("De Serialize: " + employee.getEmployeeName());
		System.out.println("De Serialize: " + employee.getSalary());



	}

}

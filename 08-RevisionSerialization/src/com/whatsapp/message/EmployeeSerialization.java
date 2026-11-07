package com.whatsapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization 
{
	public void serializedEmployee(Employee1 employee) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("Employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employee);
		oos.close();
	}

}

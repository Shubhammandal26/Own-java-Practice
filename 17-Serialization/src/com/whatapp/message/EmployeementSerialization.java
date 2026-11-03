package com.whatapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeementSerialization 
{
	public void serializeEmployee(Employeement employeement) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("Employeement.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employeement);
		oos.close();
	}

}

package com.whatapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSend
{
	public void serializationMsg(Employee employee) throws IOException
	{
		 FileOutputStream fis = new FileOutputStream("employee.ser");
		 ObjectOutputStream oos = new ObjectOutputStream(fis);
		 
		 oos.writeObject(employee);
		 oos.close();
	}

}

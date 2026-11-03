package com.whatapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMgmtSystem
{
	public void employeeDetails(EmployeeMgmt employeeMgmt) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("employeeMgmt.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employeeMgmt);
		oos.close();
	}

}

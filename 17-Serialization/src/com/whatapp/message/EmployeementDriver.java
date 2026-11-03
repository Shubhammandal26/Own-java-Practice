package com.whatapp.message;

import java.io.IOException;

public class EmployeementDriver {

	public static void main(String[] args) throws IOException 
	{
		EmployeementSerialization employeementSerialization = new EmployeementSerialization();
		
		Employeement employeement = new Employeement("EMP101", "Shubham", 35000);
		
		employeementSerialization.serializeEmployee(employeement);
		
		System.out.println("Employee Serialization Completed Successfully!");
		

	}

}

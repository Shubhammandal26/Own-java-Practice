package com.whatsapp.message;

import java.io.IOException;

public class EmpDriver1 {

	public static void main(String[] args) throws IOException 
	{
		Employee1 employee = new Employee1("ABC123", "Shivam", 56000, "Bangalore");
		
		EmployeeSerialization employeeSerialization = new EmployeeSerialization();
		
		employeeSerialization.serializedEmployee(employee);

	}

}

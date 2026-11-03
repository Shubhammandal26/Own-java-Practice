package com.whatapp.message;

import java.io.IOException;

public class EDriver {

	public static void main(String[] args) throws IOException 
	{
		EmployeeSend employeeSend = new EmployeeSend();
		
		Employee employee = new Employee("Shubham", 101);
		employeeSend.serializationMsg(employee);

	}

}

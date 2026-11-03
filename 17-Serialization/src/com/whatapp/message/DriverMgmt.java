package com.whatapp.message;

import java.io.IOException;

public class DriverMgmt {

	public static void main(String[] args) throws IOException 
	{
		EmployeeMgmtSystem employees = new EmployeeMgmtSystem();
		
		EmployeeMgmt employeeMgmt = new EmployeeMgmt("EMP102", "Shubham", 35000, "admin@123");
		
		employees.employeeDetails(employeeMgmt);

	}

}

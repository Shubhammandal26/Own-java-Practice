package com.tcs.emp;

public class DriverMgmt {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		AddressMgmt address = new AddressMgmt("BTM Layout", "Bangalore", "560029");
		
		EmployeeMgmt emp = new EmployeeMgmt("Shubham", "EMP101", address);
		
		EmployeeMgmt  clonedEmp = (EmployeeMgmt) emp.clone();
		
		System.out.println(clonedEmp.employeeId); // EMP101
		System.out.println(clonedEmp.employeeName); // Shubham
		
		System.out.println(emp.employeeId);
		System.out.println(emp.employeeName);
		
		clonedEmp.address.city = "Delhi";
		System.out.println(clonedEmp.address.city);
		System.out.println(emp.address.city);

	}

}

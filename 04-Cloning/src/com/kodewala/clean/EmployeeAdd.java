package com.kodewala.clean;

public class EmployeeAdd implements Cloneable
{
	String empId;
	String empName;
	String department;
	Addresses addresses;
	
	public EmployeeAdd(String empId, String empName, String department, Addresses addresses) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.addresses = addresses;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

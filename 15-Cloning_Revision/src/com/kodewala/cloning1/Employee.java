package com.kodewala.cloning1;

public class Employee  implements Cloneable
{
	int employeeId;
	String employeeName;
	Address address;
	
	public Employee(int employeeId, String employeeName, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

}

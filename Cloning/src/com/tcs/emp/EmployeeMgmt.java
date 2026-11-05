package com.tcs.emp;

public class EmployeeMgmt implements Cloneable
{
	String employeeName;
	String employeeId;
	AddressMgmt address;
	
	public EmployeeMgmt(String employeeName, String employeeId, AddressMgmt address) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		EmployeeMgmt e = (EmployeeMgmt) super.clone();
		e.address = (AddressMgmt) address.clone();
		return e;
	}

}

package com.kodewala.clean;

public class EEmployee implements Cloneable
{
	String empName;
	String empId;
	String department;
	EAddress address;
	
	public EEmployee(String empName, String empId, String department, EAddress address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
		this.address = address;
	}
	
//	@Override
//	public Object clone() throws CloneNotSupportedException
//	{
//		return super.clone();  // shallow cloning
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		EEmployee clonedEmp = (EEmployee) super.clone();
		clonedEmp.address = (EAddress) address.clone();
		return clonedEmp;
	}
	
	

}

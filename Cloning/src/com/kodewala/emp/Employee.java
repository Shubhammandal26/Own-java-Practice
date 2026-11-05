package com.kodewala.emp;

public class Employee implements Cloneable
{
	String empName;
	String empCode;
	Address address;
	
	public Employee(String empName, String empCode, Address address) {
		super();
		this.empName = empName;
		this.empCode = empCode;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Employee e = (Employee) super.clone();
		e.address = (Address) address.clone();
		return e;
	}
	

}

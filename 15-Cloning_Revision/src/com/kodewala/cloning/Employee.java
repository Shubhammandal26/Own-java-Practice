package com.kodewala.cloning;

public class Employee implements Cloneable
{
	String name;
	String empCode;
	Address address; // HAS-A
	
	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
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

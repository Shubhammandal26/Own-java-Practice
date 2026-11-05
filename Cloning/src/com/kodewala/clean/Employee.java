
package com.kodewala.clean;

public class Employee implements Cloneable  // Level 1
{
	String empName;
	String empId;
	Address address;
	
	public Employee(String empName, String empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
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

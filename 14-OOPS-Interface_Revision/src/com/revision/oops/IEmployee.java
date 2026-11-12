package com.revision.oops;

public interface IEmployee 
{
	void calculateSalary();
	public default void showEmployeeDetails()
	{
		System.out.println("Showing Employee Details...");
	}
	
	static boolean isValidSalary(double salary)
	{
		if(salary > 0)
		{
			System.out.println("Salary: " + salary);
			return true;
		} else {
			System.out.println("Invalid Salary");
			return false;
		}
	}
  }

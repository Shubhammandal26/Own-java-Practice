package com.revision.oops.typesOfInterface;

public interface ISalaryCalculator 
{
	void calculateSalary(double basicSalary);
	
	public default void showCompanyName()
	{
		System.out.println("Showing Company Name...");
	}
	
	public static boolean isValidSalary(double salary)
	{
		if(salary > 0)
		{
			System.out.println("Validating salary: " + salary);
			return true;
		} else {
			System.out.println("Invalid Salary");
			return false;
		}
	}
}

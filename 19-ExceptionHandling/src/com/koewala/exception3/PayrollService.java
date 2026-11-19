package com.koewala.exception3;

public class PayrollService 
{
	public boolean processSalary(String employeeId, int salary, int workingDays) throws InvalidSalaryException, MinimumWorkingDaysException
	{
		if(salary <= 0)
		{
			throw new InvalidSalaryException("Invalid salary");
		} 
		if(workingDays < 5) 
		{
		 throw new MinimumWorkingDaysException("Minimum working days not completed");	
		}
		return true;
	}
}

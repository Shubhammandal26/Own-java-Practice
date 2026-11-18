package com.koewala.exception2;

public class PayrollService 
{
	public int calculateMonthlySalary()
	{
		int salary;
		try {
			 salary = 45000;
			System.out.println("Calculating employee salary...");
			return salary;
			
		} catch (Exception e) 
		{
			System.out.println("Some error..");
		} finally {
			salary = 5000;
			System.out.println("Payroll processing completed");
		}
		return salary;	
	}

}

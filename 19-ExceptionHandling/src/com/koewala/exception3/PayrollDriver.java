package com.koewala.exception3;

public class PayrollDriver {

	public static void main(String[] args)  
	{
		PayrollService service = new PayrollService();
		try {
		service.processSalary("EMP101", -30000, 25);
		} catch(InvalidSalaryException e)
		{
			e.printStackTrace();
			
		} catch(MinimumWorkingDaysException e)
		{
			e.printStackTrace();
		}
		System.out.println("Salary Processing completed");

	}

}

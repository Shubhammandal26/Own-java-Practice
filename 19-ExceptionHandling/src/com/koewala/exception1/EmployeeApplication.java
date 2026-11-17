package com.koewala.exception1;

public class EmployeeApplication {

	public static void main(String[] args) 
	{
		SalaryService service = new SalaryService();
		String employeeId = "EMP101";
		String employeeName = "Rahul";
		int basicSalary = 30000;
		int workingDays = 30;
		int totalDays = 0;
		
		service.processSalary(employeeId, employeeName, basicSalary, workingDays, totalDays);
	}
 }

class SalaryService
{
	void processSalary(String employeeId, String employeeName, int basicSalary, int workingDays, int totalDays)
	{
		System.out.println("SalaryService.processSalary() START");
		
		validateEmployee(employeeId, employeeName, basicSalary, workingDays, totalDays);
		
		System.out.println("SalaryService.processSalary() END");
	}
	
	boolean validateEmployee(String employeeId, String employeeName, int basicSalary, int workingDays, int totalDays)
	{
		System.out.println("SalaryService.validateEmployee() START");
		boolean isValid = false;
		
		try {
			if(employeeId.startsWith("EMP") && employeeName.charAt(0) != ' ')
			{
				isValid = true;
			}
			
		} catch(NullPointerException e) 
		{
			System.out.println("Employee ID or Employee Name is null");
			e.printStackTrace();
			
		} catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Employee Name cannot be empty");
			e.printStackTrace();
			
		}
		if(isValid)
		{
			calculateSalary(basicSalary, workingDays, totalDays);
		}
		
		System.out.println("SalaryService.validateEmployee() END");
		return isValid;
	}
	
	public double calculateSalary(int basicSalary, int workingDays, int totalDays)
	{
		System.out.println("SalaryService.calculateSalary() START");
		int salary = 0;
		try {
		 salary = basicSalary * workingDays / totalDays;
		System.out.println(salary);
		} catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}
		System.out.println("SalaryService.calculateSalary() END");
		return salary;
	}
	
}

package com.kodewala.encapsulation;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private int basicSalary;
	
	public Employee(int employeeId, String employeeName, int basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
	
	
	public int calculateHRA()
	{
		int totalSalary = 0;
		if(basicSalary > 0)
		{
			totalSalary = basicSalary * 20 / 100;
		}
		return totalSalary;
	}
   
	
	public int calculateDA()
	{
		int totalSalaryDA = 0;
		if(basicSalary > 0)
		{
		 totalSalaryDA = basicSalary * 10 / 100;
		}
		return totalSalaryDA ;
	}
	
	public int calculateGrossSalary()
	{
		int total = basicSalary + calculateHRA() + calculateDA();
		return total;
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Basic Salary: " + basicSalary);
	}
}



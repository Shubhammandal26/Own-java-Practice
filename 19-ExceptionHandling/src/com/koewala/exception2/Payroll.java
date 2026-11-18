package com.koewala.exception2;

public class Payroll {

	public static void main(String[] args) 
	{
		PayrollService service = new PayrollService();
		int finalSalary = service.calculateMonthlySalary();
		System.out.println("Employee Salary: " + finalSalary);

	}

}

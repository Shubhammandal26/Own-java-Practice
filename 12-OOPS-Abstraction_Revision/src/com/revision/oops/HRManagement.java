package com.revision.oops;

class PayrollManagement
{
	public boolean generateSalarySlip(String employeeName, double basicSalary, double hra, double deductions)
	{
		if(validateEmployee(employeeName) && validateSalary(basicSalary, hra, deductions))
		{
			double grossSalary = calculateGrossSalary(basicSalary, hra);
			double netSalary = calculateNetSalary(grossSalary, deductions);
			System.out.println("Employee Name: " + employeeName);
			System.out.println("Basic Salary: " + basicSalary);
			System.out.println("HRA: " + hra);
			System.out.println("Gross Salary: " + grossSalary);
			System.out.println("Deductions: " + deductions);
			System.out.println("Net Salary: " + netSalary);
			return true;
		} else {
			System.out.println("Invalid salary calculations");
			return false;
		}
	} 
	
	private boolean validateEmployee(String employeeName)
	{
		if(employeeName != null && !employeeName.trim().isEmpty())
		{
			System.out.println("Validating employee...");
			return true;
		} else {
			System.out.println("Invalid employee Name");
			return false;
		}
	}
	
	private boolean validateSalary(double basicSalary, double hra, double deductions)
	{
		if(basicSalary > 0 && hra >= 0 && deductions >= 0)
		{
			System.out.println("Validating salary details...");
			return true;
		} else {
			System.out.println("Invalid salary details");
			return false;
		}
	}
	
	private double calculateGrossSalary(double basicSalary, double hra)
	{
		double grossSalary = basicSalary + hra;
	System.out.println("Calculating gross salary...");	
	return grossSalary;
	}
	
	private double calculateNetSalary(double grossSalary, double deductions)
	{
		double netSalary = grossSalary - deductions;
		System.out.println("Calculating net salary...");
		return netSalary;
	}
}
public class HRManagement {

	public static void main(String[] args) 
	{
		PayrollManagement payroll = new PayrollManagement();
		payroll.generateSalarySlip("Shubham", 30000, 5000, 3000);

	}

}

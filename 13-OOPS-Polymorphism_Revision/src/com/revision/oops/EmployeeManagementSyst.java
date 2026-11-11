package com.revision.oops;

class Employees
{
	void diaplayDetails()
	{
		System.out.println("Employee details displayed");
	}
}

class FullTimeEmployees extends Employees
{
	void calculateBonus(double bonus)
	{
		System.out.println("Full-time employee bonus: " + bonus);
	}
}

class PartTimeEmployees extends Employees
{
	void calculateHourlyPayment(int salary,int days)
	{
		int total = salary * days;
		System.out.println("Total Salary: " + total);
	}
}

public class EmployeeManagementSyst {

	public static void main(String[] args) 
	{
		Employees emp = new FullTimeEmployees(); // Up casting
		FullTimeEmployees full = (FullTimeEmployees) emp; // Down casting
		full.diaplayDetails();
		full.calculateBonus(10000);

	}

}

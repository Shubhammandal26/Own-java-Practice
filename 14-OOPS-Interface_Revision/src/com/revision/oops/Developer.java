package com.revision.oops;

public class Developer implements IEmployee, IBonus
{

	@Override
	public void showEmployeeDetails() 
	{
		IEmployee.super.showEmployeeDetails();
		IBonus.super.showEmployeeDetails();
	}

	@Override
	public void calculateBonus(double salary) 
	{
		double bonus = salary * 10 / 100;
		System.out.println("Employee Bonus: " + bonus);
	}

	@Override
	public void calculateSalary() 
	{
	  System.out.println("Calculating salary");	
	}
	
	public static void main(String[] args) 
	{
		double salary = 25000;
	 if(IEmployee.isValidSalary(salary))
	 {
	  Developer developer = new Developer();
	  developer.calculateSalary();
	 developer.calculateBonus(salary);
	 developer.showEmployeeDetails();
	 }
	}
	

}

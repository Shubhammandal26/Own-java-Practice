
    package com.kodewala.inter;
	
	class FullTimeEmployee implements ISalary
	{
	@Override
	 public double calculateSalary(double basicSalary)
	{
		double bonus = 0;
	 bonus = basicSalary * 0.2;
	 System.out.println("Employee type: Full-Time");
	  System.out.println("Basic Salary: " + basicSalary);
	   System.out.println("Bonus: " + bonus);
	   return basicSalary;
	}
	@Override
	public double calculateBonus(double basicSalary)
	{
	 double bonus = 0;
	 bonus = basicSalary * 0.2;
	 System.out.println("Employee type: Full-Time");
	  System.out.println("Basic Salary: " + basicSalary);
	   System.out.println("Bonus: " + bonus);
	   return bonus;
	}
	}
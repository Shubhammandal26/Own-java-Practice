
     package com.kodewala.inter;
	 
	class ContractEmployee implements ISalary
	{
	@Override
	 public double calculateSalary(double basicSalary)
	{
	 System.out.println("Employee type: Contract");
	  System.out.println("Basic Salary: " + basicSalary);
	   return basicSalary;
	}
	@Override
	public double calculateBonus(double basicSalary)
	{
	 double bonus = 0;
	 bonus = basicSalary * 0.1;
	 System.out.println("Employee type: Contract");
	  System.out.println("Basic Salary: " + basicSalary);
	   System.out.println("Bonus: " + bonus);
	   return bonus;
	}
	}
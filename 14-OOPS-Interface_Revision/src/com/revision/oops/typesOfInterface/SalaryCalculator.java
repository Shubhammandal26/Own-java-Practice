package com.revision.oops.typesOfInterface;

public class SalaryCalculator {

	public static void main(String[] args)
	{
		ISalaryCalculator salary = (basicSalary) -> 
		{
			double hra = basicSalary * 20/100;
			System.out.println("HRA: " + hra);
			System.out.println("Total Salary: " + (basicSalary + hra));
		};
		double basicSalary = 25000;
          if(ISalaryCalculator.isValidSalary(basicSalary))
          {
          salary.calculateSalary(basicSalary);
          salary.showCompanyName();
          }
	}

}

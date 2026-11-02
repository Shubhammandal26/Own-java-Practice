
  package com.kodewala.types;
  
  interface ISalaryCalculator
  {
   double calculateSalary(double basicSalary, double bonus);
  }
  
  class  SalaryCalculator
  {
  public static void main(String[] args)
  {
   ISalaryCalculator salary = (basiSalary, bonu) ->
   {
    double totalSalary = basiSalary + bonu;
	System.out.println("Basic Salary: " + basiSalary);
	System.out.println("Bonus: " + bonu);
	return totalSalary;
   };
   double result = salary.calculateSalary(30000, 5000);
   System.out.println("Final Salary: " + result);
  }
  }

   package com.kodewala.overloading;
   
   class Employee
   {
    public void calculateSalary(double basicSalary)
	{
	System.out.println("Salary: " + basicSalary);
	}
	
	 public void calculateSalary(double basicSalary, double bonus)
	{
	double totalSalary = basicSalary + bonus;
	System.out.println("Basic Salary: " + basicSalary);
	System.out.println("Bonus: " + bonus);
	System.out.println("Total Salary: " + totalSalary);
	}
	
	 public void calculateSalary(double basicSalary, double bonus, double allowance)
	{
	double totalSalary = basicSalary + bonus + allowance;
	
	System.out.println("Basic Salary: " + basicSalary);
	System.out.println("Bonus: " + bonus);
	System.out.println("Allowance: " + allowance);
	System.out.println("Total Salary: " + totalSalary);
	}
   }
   
   class EmployeeMgmt
   {
   public static void main(String[] args)
   {
    Employee employee = new Employee();
	employee.calculateSalary(30000);
	employee.calculateSalary(30000, 5000);
	employee.calculateSalary(30000, 55000, 40000);
   }
   }
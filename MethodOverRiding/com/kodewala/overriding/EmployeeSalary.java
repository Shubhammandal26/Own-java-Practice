
    package com.kodewala.overriding;
	
	class Employee
	{
	 public void calculateSalary(double amount)
	 {
	 System.out.println("Employee Salary: " + amount);
	 }
	}
	
	class Manager extends Employee
	{
	@Override
	public void calculateSalary(double amount)
	{
	System.out.println("Manager Salary: " + amount);
	}
	}
	
	class EmployeeSalary
	{
	public static void main(String[] args)
	{
	 Employee employee = new Employee();
	 employee.calculateSalary(50000);
	 
	 Manager manager = new Manager();
	 manager.calculateSalary(40000);
	}
	}
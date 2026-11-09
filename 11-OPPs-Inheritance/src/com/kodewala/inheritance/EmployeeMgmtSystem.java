package com.kodewala.inheritance;

class Employee
{
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId, String employeeName, double salary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + salary);
	}
}

class Manager extends Employee
{
	String department;
	public Manager(int employeeId, String employeeName, double salary, String department) 
	{
		super(employeeId, employeeName, salary);
		
		this.department = department;	
	}
	
	@Override
	public void displayDetails()
	{
	   super.displayDetails();
		System.out.println("Department: " + department);
	}
  }


public class EmployeeMgmtSystem {

	public static void main(String[] args) 
	{
		Employee  emp = new Manager(101,"Shubham", 60000, "Management");
		emp.displayDetails();

	}
}

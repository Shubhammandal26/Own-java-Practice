package com.revision.oops;

class Employee
{
	void calculateSalary(int salary)
	{
		System.out.println("Calculating employee Salary..." + salary);
	}
}

class FullTimeEmployee extends Employee
{
	@Override
	void calculateSalary(int salary)
	{
		System.out.println("Full-Time Employee Salary: " + salary);
	}
}

class PartTimeEmployee extends Employee
{
	private int hours;
	public PartTimeEmployee(int hours)
	{
		this.hours = hours;
	}
	@Override
	void calculateSalary(int salary)
	{
		int total = hours * salary;
		System.out.println("Part-Time Employee Salary: " + total);
	}
}

class ContractEmployee extends Employee
{
	@Override
	void calculateSalary(int salary)
	{
		System.out.println("Contract Employee Salary: " + salary);
	}
}
public class EmployeeMgmtSystem {

	public static void main(String[] args) 
	{
		Employee full = new FullTimeEmployee();
		full.calculateSalary(50000);
		
		Employee part = new PartTimeEmployee(4);
		part.calculateSalary(4000);
		
		Employee contract = new ContractEmployee();
		contract.calculateSalary(30000);

	}

}

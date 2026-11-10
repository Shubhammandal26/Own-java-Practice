package com.kodewala.encapsulation;

public class EmpDriver {

	public static void main(String[] args) 
	{
		Employee emp = new Employee(101, "Rahul", 30000);
		
		System.out.println("HRA Salary: " + emp.calculateHRA());
		System.out.println("DA: " + emp.calculateDA());
		System.out.println("Calculate Gross Salary: " + emp.calculateGrossSalary());
		
		emp.displayEmployeeDetails();

	}

}

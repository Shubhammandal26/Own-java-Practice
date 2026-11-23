package com.kodewala.collections;

import java.util.ArrayList;

public class EmployeeService 
{
	ArrayList<Employee> employee = new ArrayList<Employee>();
	
	public void addEmployee()
	{
		Employee emp = new Employee();
		
		emp.employeeId = "EMP101";
		emp.employeeName = "Amit";
		emp.department = "IT";
		emp.salary = 45000;
		
		employee.add(emp);
	}
	
	public void displayEmployee()
	{
		for(Employee emp: employee)
		{
			System.out.println("Employee ID: " + emp.employeeId);
			System.out.println("Employee Name: " + emp.employeeName);
			System.out.println("Department: " + emp.department);
			System.out.println("Salary: " + emp.salary);
		}
	}
	
	public void getEmployeeByIndex(int index)
	{
			System.out.println(employee.get(index));
	}
	
	public void updateEmployee(int index)
	{
		System.out.println(employee.get(index));
	}
	
	public void removeEmployee(int index)
	{
		System.out.println(employee.remove(index));
	}
	
	public void getTotalEmployees()
	{
		int totalEmployees = employee.size();
		System.out.println("Total Employees: " + totalEmployees);
		
	}
	
	public void searchEmployee(int index)
	{
		Employee emp = employee.get(index);
		
		System.out.println(emp.employeeId);
		System.out.println(emp.employeeName);
	    System.out.println(emp.department);
	    System.out.println(emp.salary);
	}

}

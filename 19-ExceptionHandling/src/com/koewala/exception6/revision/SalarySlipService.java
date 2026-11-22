package com.koewala.exception6.revision;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SalarySlipService 
{
	public void generateSalarySlip(Employee employee)
	{
		String fileName = "salarySlip.txt";
		
		try(FileWriter fileWriter = new FileWriter(new File(fileName)))
		{
			fileWriter.write("Employee ID: " + employee.employeeId + "\n");
			fileWriter.write("Employee Name: " + employee.employeeName + "\n");
			fileWriter.write("Employee Salary: " + employee.salary + "\n");
			System.out.println("Salary slip generated successfully");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
   }

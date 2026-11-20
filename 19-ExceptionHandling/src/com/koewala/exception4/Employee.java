package com.koewala.exception4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee {

	public static void main(String[] args) 
	{
      String fileName = "salary_slip.txt";
      
      try(FileWriter write = new FileWriter(new File(fileName)))
      {
    	String employeeId = "EMP101";
    	String empName = "Rahul";
    	String department = "IT";
    	int basicSalary = 40000;
    	int HRA = 10000;
    	int allowance = 5000;
    	int total = basicSalary + HRA + allowance;
    	
    	write.write("Employee ID:" + employeeId + "\n");
    	write.write("Employee Name:" + empName + "\n");
    	write.write("Department: " + department + "\n");
    	write.write("Basic Salary:" + basicSalary + "\n");
    	write.write("HRA:" + HRA + "\n");
    	write.write("Allowance:" + allowance + "\n");
    	write.write("Total Salary:" + total + "\n");
    	
    	System.out.println("Salary slip generated successfully");
      } catch (IOException e) 
      {
		e.printStackTrace();
	}

	}

}

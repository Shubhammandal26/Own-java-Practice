package com.whatapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatapp.message.EmployeeMgmt;

public class EmployeeMgmtDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\shubh\\OneDrive\\Documents\\Kodewala\\Learning-Java\\01-Serialization\\employeeMgmt.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		EmployeeMgmt employeeMgmt = (EmployeeMgmt) ois.readObject();
		
		System.out.println("Employee ID: " + employeeMgmt.getEmployeeId());
		System.out.println("Employee Name: " + employeeMgmt.getEmployeeName());
		System.out.println("Employee Salary: " + employeeMgmt.getSalary());
		System.out.println("Employee Password: " + employeeMgmt.getPassword());
		
		

	}

}

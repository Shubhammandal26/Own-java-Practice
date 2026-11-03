package com.whatapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatapp.message.Employeement;

public class EmployeementDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\Kodewala\\\\Learning-Java\\\\01-Serialization\\Employeement.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employeement employeement = (Employeement) ois.readObject();
		
		System.out.println("Employee ID: " + employeement.getEmployeeId());
		System.out.println("Employee Name: " + employeement.getEmployeeName());
		System.out.println("Employee Salary: " + employeement.getSalary());

	}

}

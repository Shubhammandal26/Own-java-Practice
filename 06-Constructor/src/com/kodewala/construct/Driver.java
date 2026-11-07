package com.kodewala.construct;

class Company
{
	String companyName;
	
   Company(String companyName)
   {
	this.companyName = companyName;	
	}
}

class Employee extends Company
{
	String empName;
	int age;
	String gender;
	Employee(String companyName, String empName, int age, String gender) 
	{
		super(companyName);
		
		this.empName = empName;
		this.age = age;
		this.gender = gender;
	}
	public void displayDetails()
	{
		System.out.println("Company Name: " + companyName);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Age: "  + age);
		System.out.println("Employee Gender: " + gender);
	}
	
}
public class Driver
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("TapQuick pvt ltd", "Shubham", 24, "Male");
		emp.displayDetails();
		
	}

}

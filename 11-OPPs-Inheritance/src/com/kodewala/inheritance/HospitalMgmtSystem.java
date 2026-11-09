package com.kodewala.inheritance;

class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo()
	{
		System.out.println("Person Name: " + name);
		System.out.println("Person Age: " + age);
	}
}

class HospitalEmployee extends Person
{
     String employeeId;
     double salary;
     
	HospitalEmployee(String name, int age, String employeeId, double salary) {
		super(name, age);
		this.employeeId = employeeId;
		this.salary = salary;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Salary: " + salary);
	}
}

class Doctor extends HospitalEmployee
{
	String specialization;
    Doctor(String name, int age, String employeeId, double salary, String specialization) 
    {
		super(name, age, employeeId, salary);
	    this.specialization = specialization;	
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Doctor Specialization: " + specialization);
	}
}

public class HospitalMgmtSystem 
{
	public static void main(String[] args) 
	{
		Person hospital = new HospitalEmployee("Rahul", 22, "EMP123", 25000);
		hospital.displayInfo();
		
		Person doctor = new Doctor("Ritesh", 35,"EMP123",35000,"Neurologist");
		doctor.displayInfo();

	}

}

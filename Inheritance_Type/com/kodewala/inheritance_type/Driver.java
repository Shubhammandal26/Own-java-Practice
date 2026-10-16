 
  package com.kodewala.inheritance_type;
  
  class Employee
{
 String name;
 String age;
 String address;
 
 public Employee(String name, String age, String address) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
 }
  public void displayDetails()
  {
	System.out.println("Name: " + name);  
	System.out.println("Age: " + age);  
	System.out.println("Address: " + address);  
  }
}

class Manager extends Employee
{
	String project;
	int yearsOfExperience;
	
	public Manager(String name, String age, String address, String project, int yearsOfExperience) 
	{
		super(name, age, address);
		this.project = project;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void displayManagerDetails() 
	{
		super.displayDetails();
	 System.out.println("Project: " + project);
	 System.out.println("Experience: " + yearsOfExperience);
	}
	
  }

public class Driver 
{

	public static void main(String[] args) 
	{
		Manager manager = new Manager("shubham", "24", "Bangalore", "Emp mgmt", 6);
		manager.displayManagerDetails();

	}

}  
  // Single level inheritance

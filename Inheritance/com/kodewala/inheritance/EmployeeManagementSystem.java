
  package com.kodewala.inheritance;
  
  class EmployeeManagementSystem
  {
  public static void main(String[] args)
  {
    Manager manager = new Manager("Shubham", 101, 50000,"IT");
	manager.displayManagerDetails();
  }
  }
  
 class Employee
 {
  String name;
  int employeeId;
  double salary;
  
    Employee(String name,int employeeId,double salary)
	{
	 this.name = name;
	 this.employeeId = employeeId;
	 this.salary = salary;
	}
	
	public void displayEmployeeDetails()
	{
	System.out.println("Employee Name: " + name);
	System.out.println("Employee ID: " + employeeId);
	System.out.println("Employee Salary: " + salary);
	}
  }
  
   class Manager extends Employee
   {
    String department;
	
	Manager(String name,int employeeId,double salary, String department)
	{
	super(name, employeeId, salary);
	this.department = department;
   }
   
   public void displayManagerDetails()
   {
   // System.out.println("Employee Name: " + name);
  //  System.out.println("Employee ID: " + employeeId);
 //	  System.out.println("Employee Salary: " + salary);
	
	 super.displayEmployeeDetails();
	System.out.println("Employee Department: " + department);
   }
   
   }

  package com.kodewala.inheritance_type;
  
  class Employees
  {
   String name;
   int employeeId;
   double salary;
   
   Employees(String name, int employeeId, double salary)
   {
    this.name = name;
	this.employeeId = employeeId;
	this.salary = salary;
   }
   public void displayDetails()
   {
    System.out.println("Employee Name: " + name);
	System.out.println("Employee Id: " + employeeId);
	System.out.println("Employee Salary: " + salary);
   }
  }
  
  class Developer extends Employees
  {
    String programmingLanguage;
	
	Developer(String name, int employeeId, double salary, String programmingLanguage)
	{
	 super(name, employeeId, salary);
	 this.programmingLanguage = programmingLanguage;
	}
  
     public void displayDeveloperDetails()
	 {
	   super.displayDetails();
	   System.out.println("Programming Language: " + programmingLanguage);
	 }
  }
  
  class Tester extends Employees
  {
     String testingTool;
	 
	 Tester(String name, int employeeId, double salary, String testingTool)
	 {
	   super(name, employeeId, salary);
	   this.testingTool = testingTool;
	 }
	 
	 public void displayTesterDetails()
	 {
       super.displayDetails();
	   System.out.println("Testing Tool: " + testingTool);
      }
  }
  
  class EmployeeManagementSystem
  {
    public static void main(String[] args)
  {
    Developer developer = new Developer("Shubham", 101, 55000.0, "Java");
	developer.displayDeveloperDetails();
	
	Tester tester = new Tester("Rahul", 102, 45000.0, "Selenium");
	tester.displayTesterDetails();
  }
  }
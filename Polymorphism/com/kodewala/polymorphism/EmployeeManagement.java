
  package com.kodewala.polymorphism;
  
  class Employee
  {
   public void work()
   {
    System.out.println("Employee is working...");
   }
  }
  
  class Manager extends Employee
  {
  @Override
   public void work()
   {
    System.out.println("Manager is Managing the team...");
   }
   public void manageTeam()
   {
    System.out.println("Manager team members...");
   }
  }
  
  class EmployeeManagement
  {
   public static void main(String[] args)
  {
   Employee manager = new Manager(); // upcasting
   manager.work();
   
 //  Employee manager = new Manager();  // down casting
  if(manager instanceof Manager)
  {
	  Manager employee = (Manager) manager;
	  employee.manageTeam();
  }
  
  }
  }
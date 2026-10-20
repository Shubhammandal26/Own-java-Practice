

   package com.kodewala.overloading;
  
  class Hr
  {
  public void displayEmployee(int employeeId)
  {
  System.out.println("Employee ID: " + employeeId);
  }
  
   public void displayEmployee(int employeeId, String name)
  {
   
   System.out.println("Employee ID: " + employeeId);
   System.out.println("Employee Name: " + name);
  }
  
   public void displayEmployee(int employeeId, String name, String department)
  {
   
   System.out.println("Employee ID: " + employeeId);
   System.out.println("Employee Name: " + name);
   System.out.println("Department: " + department);
  }
  }
  
  class EmployeeManagemrntSystem
  {
   public static void main(String[] args)
  {
   Hr hr = new Hr();
   hr.displayEmployee(101);
   hr.displayEmployee(102, "Rahul");
   hr.displayEmployee(103, "Priya", "IT");
  }
  }

   package com.kodewala.polymorphism;
   
   class Employees
   {
    public void work()
	{
	System.out.println("Employee is working...");
   }
   }
   
   class Developer extends Employees
   {
   @Override
    public void work()
	{
	System.out.println("Developer is writing code...");
   }
   public void writeCode()
   {
    System.out.println("Developer is writing Java code...");
   }
   }
   
   class EmployeeManagementSystem
   {
    public static void main(String[] args)
   {
       Employees employees = new Developer();
	   employees.work();
	
 	if(employees instanceof Developer)
	{
		Developer developer = (Developer)employees;
		developer.writeCode();
	} 
   
   }
   }
    
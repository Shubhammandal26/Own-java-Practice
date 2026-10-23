
   package com.kodewala.polymorphism;
   
   class Employee
   {
    public void calculateSalary()
   {
    System.out.println("Calculating employee salary");
   }
   }
   
   class FullTimeEmployee extends Employee
   {
    @Override
	public void calculateSalary()
   {
    System.out.println("Calculating full-time employee salary...");
   }
   }
   
    class PartTimeEmployee extends Employee
   {
    @Override
	public void calculateSalary()
   {
    System.out.println("Calculating part-time employee salary...");
   }
   }
   
    class ContractEmployee extends Employee
   {
    @Override
	public void calculateSalary()
   {
    System.out.println("Calculating contract employee salary...");
   }
   }
   
   class InternEmployee extends Employee
   {
    @Override
	public void calculateSalary()
   {
    System.out.println("Calculating interm employee salary...");
   }
   }
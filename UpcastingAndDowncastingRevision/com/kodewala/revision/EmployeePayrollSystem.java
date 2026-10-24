
   package com.kodewala.revision;
  
  class Employee
  {
  public void calculateSalary()
  {
   System.out.println("Calculating employee salary...");
  }
  }
  
  class FullTimeEmployee extends Employee
  {
   @Override
   public void calculateSalary()
  {
   System.out.println("Calculating full-time employee salary...");
  }
  public void displayBenefits()
  {
  System.out.println("Displaying full-time employee benefits...");
  }
  }
  
  class ContractEmployee extends Employee
  {
   @Override
   public void calculateSalary()
  {
   System.out.println("Calculating contract employee salary...");
  }
  public void displayContractDuration()
  {
  System.out.println("Contract duration: 12 months");
  }
  }
  
  class EmployeePayrollSystem
  {
   public static void main(String[] args)
  {
    Employee employee1 = new FullTimeEmployee();
	employee1.calculateSalary();
	
	Employee employee2 = new ContractEmployee();
	employee2.calculateSalary();
	
	if(employee1 instanceof FullTimeEmployee)
	{
	 FullTimeEmployee full = (FullTimeEmployee) employee1;
	 full.displayBenefits();
	}
	
	if(employee2 instanceof ContractEmployee)
	{
	 ContractEmployee contract = (ContractEmployee) employee2;
	 contract.displayContractDuration();
	}
  }
  }
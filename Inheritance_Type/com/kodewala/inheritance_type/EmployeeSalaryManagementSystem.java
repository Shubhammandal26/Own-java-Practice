
    package com.kodewala.inheritance_type;
	
	class Employeess
  {
   String name;
   int employeeId;
   double basicSalary;
   
    Employeess(String name, int employeeId, double basicSalary)
   {
    this.name = name;
	this.employeeId = employeeId;
	this.basicSalary = basicSalary;
   }
   public void displayEmployeeDetails()
   {
    System.out.println("Employees Name: " + name);
	System.out.println("Employee ID: " + employeeId);
	System.out.println("Basic Salary: " + basicSalary);
   }
  }
  
  class FullTimeEmployee extends Employeess
  {
    double bonus;
	
	FullTimeEmployee(String name, int employeeId, double basicSalary, double bonus)
	{
	 super(name, employeeId, basicSalary);
	 this.bonus = bonus;
	}
 
     public void displayFullTimeSalary()
	 {
		 double totalSalary = 0;
	   super.displayEmployeeDetails();
	   System.out.println("Bonus: " + bonus);
	    totalSalary = basicSalary + bonus;
	   System.out.println("Total Salary: " + totalSalary);
	 }
  }
  
  class ContractEmployee extends Employeess
  {
     int contractMonths;
	 
	 ContractEmployee(String name, int employeeId, double basicSalary,int contractMonths)
	 {
	   super(name, employeeId, basicSalary);
	   this.contractMonths = contractMonths;
	 }
	 
	 public void displayContractDetails()
	 {
       super.displayEmployeeDetails();
	   System.out.println("Contract Months: " + contractMonths);
      }
  }
  
  class EmployeeSalaryManagementSystem
  {
    public static void main(String[] args)
  {
    FullTimeEmployee fullTime = new FullTimeEmployee("Rahul", 101, 40000.0, 5000.0);
	fullTime.displayFullTimeSalary();

   ContractEmployee contract = new ContractEmployee("Amit", 102, 30000.0, 6);
   contract.displayContractDetails();
  }
  }
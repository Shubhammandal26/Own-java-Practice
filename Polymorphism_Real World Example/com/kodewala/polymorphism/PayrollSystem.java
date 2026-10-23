
    package com.kodewala.polymorphism;
	
	class PayrollSystem
	{
	 public static void main(String[] args)
	{
	 EmployeePayrollSystem employeePayroll = new EmployeePayrollSystem();
	 
	 FullTimeEmployee fullTime = new FullTimeEmployee();
	 employeePayroll.processSalary(fullTime);
	 
	 PartTimeEmployee partTime = new PartTimeEmployee();
	 employeePayroll.processSalary(partTime);
	 
	 ContractEmployee contract = new ContractEmployee();
	 employeePayroll.processSalary(contract);
	 
	 InternEmployee intern = new InternEmployee();
	 employeePayroll.processSalary(intern);
	
	}
	}

     package com.kodewala.inter;
	 
	 class EmployeeService
	 {
	  public void processSalary(ISalary employee, double basicSalary)
	  {
	   employee.calculateSalary(basicSalary);
	  }
	  
	  public void paySalary(ISalary employee, double basicSalary)
	  {
	   employee.calculateBonus(basicSalary);
	  }
	  
	 
	  public static void main(String[] args)
	 {
	  EmployeeService employeeService = new EmployeeService();
	  employeeService.processSalary(new FullTimeEmployee(), 50000);
	  employeeService.paySalary(new ContractEmployee(), 30000);
	 
	 }
	 }
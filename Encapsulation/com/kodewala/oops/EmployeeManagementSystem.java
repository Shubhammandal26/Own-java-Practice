  
     package com.kodewala.oops;
	 
	 class EmployeeManagementSystem
	 {
	 public static void main(String[] args)
	 {
	  HRApplication hr = new HRApplication("EM1234","Shubham",40000);
	  System.out.println("Calculate bonus: " + hr.calculateBonus());
	  System.out.println("Calculate net salary: " + hr.calculateNetSalary());
	  System.out.println("Increase in salary" + hr.calculateIncrement());
	 }
	 }
	 
	 class HRApplication
	 {
	 private String employeeID;
	 private String employeeName;
	 private int basicSalary;
	 
	 public HRApplication(String employeeID,String employeeName,int basicSalary)
	 {
	 this.employeeID = employeeID;
	 this.employeeName = employeeName;
	 this.basicSalary = basicSalary;
	 }
	 
	 public int calculateBonus()
	 {
		 int bonus = 0;
	  if(basicSalary > 0)
	  {
	    bonus = basicSalary * 10/100;
	  }
	  return bonus;
	 }
	 
	 public int calculateNetSalary()
	 {
	  int netSalary = basicSalary + calculateBonus();
	  System.out.println("Net salary is: "  + netSalary);
	  return netSalary;
	 }
	 
	 public int calculateIncrement()
	 {
		 int increment = 0;
		 
		 if(basicSalary < 30000)
		 {
		  increment = basicSalary * 15/100;	 
		 } else {
			 increment = basicSalary * 10/100;
		 }
		  return increment;
	 }
	 }
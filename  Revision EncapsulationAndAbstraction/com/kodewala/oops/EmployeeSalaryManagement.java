
   package com.kodewala.oops;
   
   class Employee
   {
   private String employeeName;
   private double basicSalary;
   private double bonus;
   
   Employee(String employeeName, double basicSalary, double bonus)
   {
    this.employeeName = employeeName;
	this.basicSalary = basicSalary;
	this.bonus = bonus;
   }
   
   private boolean validateSalary()
   {
    if(basicSalary > 0){
	 return true;
	} else {
	 return false;
	}
   }
   
   private double calculateTotalSalary()
   {
     double totalSalary = basicSalary + bonus; 
	 return totalSalary;
   }
   
   public void generateSalarySlip()
   {
    if(validateSalary())
	{
	 System.out.println("Employee Name: " + employeeName);
	 System.out.println("Total Salary: " + calculateTotalSalary());
	} else {
	System.out.println("Invalid basic salary");
	}
   }
   }
   
   class EmployeeSalaryManagement
   {
    public static void main(String[] args)
   {
    Employee emp = new Employee("Rahul", 50000, 5000);
	emp.generateSalarySlip();
   }
   }
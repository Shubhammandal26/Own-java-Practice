  
   package com.kodewala.oops;
   
   class EmployeeSalary
   {
    private String employeeName;
	private double basicSalary;
	private int overtimeHours;
	
	EmployeeSalary(String employeeName, double basicSalary, int overtimeHours)
	{
	 this.employeeName = employeeName;
	 this.basicSalary = basicSalary;
	 this.overtimeHours = overtimeHours;
	}
	
	private boolean validateSalary()
	{
	 if(basicSalary > 0 && overtimeHours >= 0)
	 {
	  return true;
	 } else {
	  return false;
	 }
	}
	
	private double calculateOvertimePay()
	{
	double overtime = 0;
	 if(overtimeHours <= 10)
	 {
	  return  overtimeHours * 200;
	 } else 
	 {
	  return  (10 * 200) + (overtimeHours - 10) * 300;
	 }  
	}
	
	public void generateSalarySlip()
	{
	 if(validateSalary())
	 {
	 System.out.println("Employee Name: " + employeeName);
	  System.out.println("Overtime Pay: " + calculateOvertimePay());
	  double totalSalary = basicSalary + calculateOvertimePay();
	   System.out.println("Total Salary: " + totalSalary);
	 } else {
	  System.out.println("Invalid salary details");
	 }
	}
	}
	
	class EmployeeOverTimeSalary
	{
	 public static void main(String[] args)
	{
	 EmployeeSalary employeeSalary = new EmployeeSalary("Rahul", 50000, 12);
	 employeeSalary.generateSalarySlip();
	}
	}
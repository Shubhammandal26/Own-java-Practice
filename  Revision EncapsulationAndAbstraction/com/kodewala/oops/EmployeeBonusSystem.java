
  package com.kodewala.oops;
  
  class EmployeeBonus
  {
   private String employeeName;
   private double salary;
   private int performanceRating;
   
   EmployeeBonus(String employeeName, double salary, int performanceRating)
   {
   this.employeeName = employeeName;
   this.salary = salary;
   this.performanceRating = performanceRating;
   }
   
   private boolean validateRating()
   {
    if(performanceRating >= 1 && performanceRating <= 5){
	return true;
   } else {
     return false;
   }
   }
   
   private double calculateBonus()
   {
     if(performanceRating == 5)
	 {
	  return salary * 20 / 100;
	 } else if(performanceRating == 4){
	  return salary * 15/ 100;
	 } else if(performanceRating == 3){
	  return salary * 10 / 100;
	 } else {
	  return 0;
	 }
  }
  
  public void generateBonusReport()
  {
    if(validateRating())
	{
	 System.out.println("Employee Name: " + employeeName);
	 System.out.println("Bonus Amount: " + calculateBonus());
	} else {
	System.out.println("Invalid Performance rating");
	}
  }
  }
  
  class EmployeeBonusSystem
  {
   public static void main(String[] args)
  {
   EmployeeBonus employeeBonus = new EmployeeBonus("Rahul", 50000, 4);
   employeeBonus.generateBonusReport();
   
  }
  }
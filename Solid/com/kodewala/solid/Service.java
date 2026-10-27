
  package com.kodewala.solid;
  
  class Service
  {
  public static void main(String[] args)
  {
   EmployeeService data = new EmployeeService();
   data.addEmployee("Rahul", 25000);
   
   SalaryService salaryService = new SalaryService();
   salaryService.calculateSalary(30000);
   
   
   EmailService email = new EmailService();
   email.sendEmail("rahul@gmail");
  
  }
  }
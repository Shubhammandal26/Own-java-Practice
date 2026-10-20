
    package com.kodewala.overriding;
	
  class Report
	{
	 public void generateReport()
	 {
	 System.out.println("Generating general report...");
	 }
	}
	
	class SalesReport extends Report
	{
	@Override
	public void generateReport()
	{
	System.out.println("Generating sales report...");
	}
	}
	
	class EmployeeReport extends Report
	{
	@Override
	 public void generateReport()
	 {
	 System.out.println("Generating employee report...");
	 }
	}
	
	class ReportSystem
	{
	public static void main(String[] args)
	{
	  Report report = new Report();
	  report.generateReport();
	  
	  SalesReport sale = new SalesReport();
	  sale.generateReport();
	  
	  EmployeeReport employee = new EmployeeReport();
	   employee.generateReport();
	}
	}
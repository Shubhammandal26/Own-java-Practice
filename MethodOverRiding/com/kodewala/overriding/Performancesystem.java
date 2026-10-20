  
  package com.kodewala.overriding;
	
	class Employees
	{
	 public void calculatePerformance()
	 {
	 System.out.println("Calculating general employee performance");
	 }
	}
	
	class Developer extends Employees
	{
	@Override
	public void calculatePerformance()
	{
	System.out.println("Calculating developer performance based on code quality");
	}
	}
	
	class Managers extends Employees
	{
	@Override
	 public void calculatePerformance()
	 {
	 System.out.println("Calculating manager performance based on team results");
	 }
	}
	
	class Performancesystem
	{
	public static void main(String[] args)
	{
	 Employees emp = new Employees();
	 emp.calculatePerformance();
	 
	 Developer developer = new Developer();
	 developer.calculatePerformance();
	 
	 Managers manager = new Managers();
	 manager.calculatePerformance();
	}
	} 
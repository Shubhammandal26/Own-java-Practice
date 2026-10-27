   package com.kodewala.solid;
   
   class Employee
   {
   public void calculateBonus(double salary)
   {
   System.out.println("Calculating general employee bonus");
   }
   }
   
   class Developer extends Employee
   {
    @Override
	public void calculateBonus(double salary)
	{
	double bonus = 0;
	bonus = salary * 0.15;
	 System.out.println("Developer bonus: " + bonus);
	}
	public void writeCode()
	{
		System.out.println("Developer is writing code");
	}
	}
	
	 class Manager extends Employee
   {
    @Override
	public void calculateBonus(double salary)
	{
	double bonus = 0;
	bonus = salary * 0.25;
	 System.out.println("Manager bonus: " + bonus);
	}
	}
	
	class BonusService
	{
	public static void main(String[] args)
	{
	 Employee employee = new Developer();
	 employee.calculateBonus(60000);
	 
	 
	 Employee employee1 = new Manager();
	 
	 if(employee1 instanceof Manager)
	 {
	  Manager manager = (Manager) employee1;
	  manager.calculateBonus(60000);
	 }
	 Employee employee2 = new Developer();

if (employee2 instanceof Developer) {
    Developer developer = (Developer) employee2;
    developer.writeCode();
}
	}
	}
   
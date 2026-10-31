

   package com.kodewala.inter2;
   
   interface IEmployee
   {
    double calculateSalary(double basicSalary);
	
	default void displayCompanyDetails()
	{
	System.out.println("Welcome to Kodewala Academy Bengaluru");
	}
	
	static double calculateBonus(double salary)
	{
	 double bonus = 0;
	 bonus = (salary * 10) / 100;
	 return bonus;
	}
   }
   
   class PermanentEmployee implements IEmployee
   {
    public double calculateSalary(double salary)
	{
	 double hra = salary * 20/100 ;
	 double totalSalary = salary + hra;
	 return totalSalary;
	}
   }
   
   class ContractEmployee implements IEmployee
   {
    public double calculateSalary(double salary)
	{
	 double allowance = salary * 10/100;
	double totalSalary = salary + allowance;
	 return totalSalary;
	}
   }
   
   class Employee
   {
    public static void main(String[] args)
   {
    double bonus = IEmployee.calculateBonus(40000);
	
	IEmployee permanent = new PermanentEmployee();
	
	double permaneentSalary = permanent.calculateSalary(40000);
	 double finalSalary = permaneentSalary + bonus;
	 System.out.println("Final Salary: " + finalSalary);
	 permanent.displayCompanyDetails();
   
   IEmployee contract = new ContractEmployee();
	
	double contractSalary = contract.calculateSalary(40000);
	double finalSalary1 = contractSalary + bonus;
	System.out.println("Final salary: " + finalSalary1);
	contract.displayCompanyDetails();
   }
   }
   
   
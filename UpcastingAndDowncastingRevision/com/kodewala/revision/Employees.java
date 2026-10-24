
    package com.kodewala.revision;
	
	class Employees
	{
	public void calculateBonus()
	{
	System.out.println("Calculating employee bonus....");
	}
	}
	
	class PermanentEmployee extends Employees
	{
	@Override
	public void calculateBonus()
	{
	 System.out.println("Calculating bonus for permanent Employee...");
	}
	}
	
	class ContractedEmployee extends Employees
	{
	@Override
	public void calculateBonus()
	{
	 System.out.println("Calculating bonus for contract Employee...");
	}
	}
	
	class Manager extends Employees
	{
	@Override
	public void calculateBonus()
	{
	 System.out.println("Calculating bonus for Manager...");
	}
	}
package com.revision.oops;

public interface IBonus 
{
	void calculateBonus(double salary);
	
	public default void showEmployeeDetails()
	{
		System.out.println("Showing Employee Details");
	}

}

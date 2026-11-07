package com.emp.test;

import java.util.ArrayList;

class Employee
{
	int id;
	
	Employee(int id)
	{
		this.id = id;
	}
}
public class Driver {

	public static void main(String[] args) 
	{
		ArrayList<Employee> list = new ArrayList<>();
		for(int i = 1; i <= 10000000; i++)
		{
			Employee emp = new Employee(i);
			list.add(emp);
		}

	}

}

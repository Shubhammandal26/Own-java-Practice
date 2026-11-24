package com.kodewala.collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMgmt {

	public static void main(String[] args)
	{
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Amit");
		name.add("Rahul");
		name.add("Priya");
		name.add("Sneha");
		name.add("Vikas");
		
		System.out.println("Employee List: ");
		
		Iterator<String> itr = name.iterator(); 
		
		while(itr.hasNext())  // hasNext() -> Checks whether another element exists
		{
			System.out.println(itr.next());   // next() -> Return the next element
		}
		
		System.out.println();
		
		while(itr.hasNext())
		{
			String names = itr.next();
			
			if(names.equals("Priya"))
			{
				itr.remove();
			}
		}
		
		System.out.println("Updated Employee List: ");
		for(String nam: name)
		{
			System.out.println(nam);
		}
		
		
//		System.out.println("Using Normal For Loop: ");
//		for(int i = 0; i < name.size(); i++)
//		{
//			System.out.println(name.get(i));
//		}
//		
//		System.out.println();
//		
//		System.out.println("Using Enhanced For Loop");
//		for(String n: name)
//		{
//			System.out.println(n);
//		}
//		
//		System.out.println();
//		System.out.println("Employees Starting with S:");
//		for(String names: name)
//		{
//		if(names.startsWith("S"))
//		{
//		System.out.println(names);
//		}
//		}

	}

}

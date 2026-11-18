package com.koewala.exception2;

public class Driver1 {

	public static void main(String[] args) 
	{
//		String name = "shubham";
//		System.out.println(name.length());
		
		String className = "com.koewala.exception2.Driver12";
		try 
		{
			Class.forName(className);
			System.out.println("Class loaded...");
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

}

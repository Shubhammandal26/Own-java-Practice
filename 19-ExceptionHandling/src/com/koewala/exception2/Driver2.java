package com.koewala.exception2;

import java.io.FileReader;

public class Driver2 
{

	public static void main(String[] args) 
	{
		String fileName = "C:\\Users\\shubh\\Documents\\employee.txt";
		
		try {
		FileReader reader = new FileReader(fileName);
		 
		System.out.println("File opened successfully...");
		
		} catch (Exception e) {
			System.out.println("Employee file Not found...");
			e.printStackTrace();
		}
	}
}

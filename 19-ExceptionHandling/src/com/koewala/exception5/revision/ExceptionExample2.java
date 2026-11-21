package com.koewala.exception5.revision;

public class ExceptionExample2 {

	public static void main(String[] args) 
	{
		int[] arr = {5, 23, 44, 78};
		
		try {
			System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Invalid index! Array size is only " + arr.length);
		}
		System.out.println("Program continues after handling the exception");
	}

}

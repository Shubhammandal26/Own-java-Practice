package com.koewala.exception;

public class ExceptionExample {

	public static void main(String[] args) 
	{
		System.out.println("ExceptionalExample.main() - STARTED");
		
		int[] arr = {1, 2, 3};
		System.out.println(arr[5]);
		
		System.out.println("This line won't executed.");
		
		System.out.println("ExceptionalExample.main() - ENDED");

	}

}

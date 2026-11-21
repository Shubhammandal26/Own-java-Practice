package com.koewala.exception5.revision;

public class ExceptionExample1 {

	public static void main(String[] args) 
	{
		System.out.println("ExceptionExample1.main()- STARTED");
		
		int arr[] = {1, 2,3};
		System.out.println(arr[4]);
		
		System.out.println("This line won't execute");
		
		System.out.println("ExceptionExample1.main()- ENDED");

	 }
  }

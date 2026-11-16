package com.koewala.exception;

public class MultipleTryBlock {

	public static void main(String[] args) 
	{
		System.out.println("MultipleTryBlock.main()... START");
		
		try 
		{
		  int amount = 100;
		  int part = 5;
		  int total = amount / part;
		  System.out.println(total);
		  
		  int arr[] = {10, 20, 30};
		  System.out.println(arr[5]);
		} 
		catch(ArithmeticException e) 
		{
			System.out.println("Cannot divided by zero");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid array index");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		
		System.out.println("MultipleTryBlock.main()... END");
	}
      }

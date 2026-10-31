

     package com.kodewala.inter2;
	 
	 interface BankUtility
	 {
		 // Static Method
	  static void calculateInterest(double amount, double rate, double time)
	  {
	   double si = (amount * rate * time ) / 100;
	   System.out.println("Simple interest: " + si);
	  }
	 }
	 
	 class BankAccount implements BankUtility
	 {
	 
	 }
	 
	 class CalculationInterest
	 {
	 public static void main(String[] args)
	 {
	  BankUtility.calculateInterest(1500, 5,2);
	 }
	 }
package com.revision.oops;

public class LoanService {

	public static void main(String[] args) 
	{
		Customer loan = new Customer(1500);
		loan.deposit(2000);
		loan.withdraw(1000);
		loan.applyForLoan(1500);
		loan.checkLoanStatus();
		
	}

}

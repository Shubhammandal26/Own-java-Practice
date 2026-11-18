package com.koewala.exception2;

public class Bank {

	public static void main(String[] args)
	{
		BankService service = new BankService();
	int remainingBalance =	service.withdrawAmount();
	System.out.println("Final Balance: " + remainingBalance);

	}

}

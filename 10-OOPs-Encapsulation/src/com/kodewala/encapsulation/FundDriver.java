package com.kodewala.encapsulation;

public class FundDriver {

	public static void main(String[] args)
	{
		FundTransfer fund = new FundTransfer("Shubham", "451203", 1200);
		
//		fund.doCredit(300);
		
		fund.doDebit(500);
		fund.checkBalance();
		
		

	}

}

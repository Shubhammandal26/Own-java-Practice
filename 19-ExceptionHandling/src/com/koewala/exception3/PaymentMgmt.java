package com.koewala.exception3;

public class PaymentMgmt 
{
	public void doPayment(String account, int amount)
	{
		try {			
			checkBalance(account, amount);
		} catch (InsufficientBalanceException e)
		{
			throw new FundTransferException("You do not have enough balance OR " + 
		                               " in case you have opend the account recently, "
		                           + " please wait for 24hrs before doing fund transfer");
		}
	}
	
	private boolean checkBalance(String account, int amount)
	{
		 boolean checkBalanceStatus = false;
		 int balance = 1000;
		 if(amount > balance)
		 {
			 throw new InsufficientBalanceException(account + " does not have enough balance and current balance is: " + balance);
		 } else {
			 checkBalanceStatus = true;
		 }
		 return checkBalanceStatus;
	}

}

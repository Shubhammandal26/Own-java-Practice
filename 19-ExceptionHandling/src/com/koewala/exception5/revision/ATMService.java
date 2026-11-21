package com.koewala.exception5.revision;

public class ATMService 
{
	public void withdraw(double balance, double amount, double dailyWithdrawn)
	{
		if(amount <= 0)
		{
		   throw new InvalidAmountException ("Invalid amount"); 
		   
		} else if(balance  < amount)
		{
			throw new InsufficientBalanceException ("Insufficient Balance");
		}
		else if(amount + dailyWithdrawn > 25000) 
		{
			throw new DailyLimitExceededException("Daily Limit Exceed");
			
		} else {
			System.out.println("Withdrawl successful");
		}
	}

}

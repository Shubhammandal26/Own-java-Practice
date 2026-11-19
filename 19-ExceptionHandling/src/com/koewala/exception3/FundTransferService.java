package com.koewala.exception3;

public class FundTransferService 
{
	public boolean transferMoney(String accountNumber, int balance, int amount, int dailyTransferAmount) throws InvalidAccountException, InvalidAmountException
	{
		if(accountNumber == null || accountNumber.isEmpty())
		{
			throw new InvalidAccountException("Invalide Account Number");
		} 
		if(amount <= 0)
		{
			throw new InvalidAmountException("Invalide Amount");
		}
		if(amount > balance)
		{
			throw new InsufficientBalancesException("Amount is insufficient");
		}
		if(dailyTransferAmount + amount > 50000)
		{
			throw new DailyLimitExceededException("Daily transfer Limit Exceed");
		}
		return true;
	}
	
}

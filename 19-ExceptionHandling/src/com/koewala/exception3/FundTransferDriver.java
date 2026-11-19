package com.koewala.exception3;

public class FundTransferDriver {

	public static void main(String[] args) 
	{
		FundTransferService fund = new FundTransferService();
		try {
		boolean status = fund.transferMoney("ACC101", 100000, 10000, 20000);
		
		if(status)
		{
			System.out.println("Fund Transfer Successful");
		}
		} 
		
		catch(InvalidAccountException e)
		{
			System.out.println(e.getMessage());
		} 
		
		catch(InvalidAmountException e)
		{
			System.out.println(e.getMessage());
		} 
		
		catch(InsufficientBalancesException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(DailyLimitExceededException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fund Transfer process completed");

	}

}

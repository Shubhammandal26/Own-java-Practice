package com.koewala.exception5.revision;

public class ATMDriver {

	public static void main(String[] args) 
	{
		ATMService service = new ATMService();
		
		try 
		{
			service.withdraw(10000, 12000, 0);
			
		} catch (InsufficientBalanceException e) 
		{
			e.printStackTrace();
			
		} catch (InvalidAmountException e) 
		{
			e.printStackTrace();
			
		} catch (DailyLimitExceededException e) 
		{
			e.printStackTrace();
		}

	}

}

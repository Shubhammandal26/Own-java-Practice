package com.koewala.exception3;

public class AccountMgmt 
{
	void openAccount(String name, String address)
	{
		System.out.println("AccountMgmt.openAccount() START");
		activeAccount("234567456");
		System.out.println("AccountMgmt.openAccount() END");
	}
	
	private void activeAccount(String accNo)
	{
		System.out.println("AccountMgmt.activeAccount() START");
		
		checkAccountStatus(null);
		System.out.println("AccountMgmt.activeAccount() END");
	}
	
	private boolean checkAccountStatus(String accNo) 
	{
		try {
			accNo.startsWith("SBI");
		} 
		catch (NullPointerException e) 
		{
		 throw new NullPointerException("something is null");	
		}
		return false;
	}

}

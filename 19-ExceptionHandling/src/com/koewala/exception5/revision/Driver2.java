package com.koewala.exception5.revision;

public class Driver2 {

	public static void main(String[] args) 
	{
      Account account = new Account();
      String accNo = "4561230";
      String address[] = {"BTM Layout Bangalore", "JP Nagar Bangalore"};
      account.doActiveAccount(accNo, address);

	}
}

class Account
{
	public void doActiveAccount(String accNo, String address[])
	{
		System.out.println("Account.doActiveAccount() START");
		validateAccountDetails(accNo, address);
		
		System.out.println("Account.doActiveAccount() END");
	}
	
	boolean validateAccountDetails(String accNo, String address[])
	{
		System.out.println("Account.validateAccountDetails() START");
		System.out.println("Validating account details...");
		System.out.println("Checking account status...");
		
		int accountType = 1;
		String bankName = "State Bank of India";
		boolean isActive = true;
		
		System.out.println("Account type: " + accountType);
		System.out.println("Bank name: " + bankName);
		System.out.println("Account active: " + isActive);
		boolean isValid = false;
		try 
		{
			String homeAddress = address[1];
			System.out.println("Home address: " + homeAddress);
			isValid = accNo.startsWith("SBI");
			int amount = 100 / 0;
			int accNoInt = Integer.parseInt(accNo);
			
		} catch(NullPointerException e)
		{
			System.out.println("Value is null");
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You are trying to get an index from invalide index");
			e.printStackTrace();
		} catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception cannot / by zero");
			e.printStackTrace();
		} catch (Exception e) 
		{
			System.out.println("Some other error");
		}
		System.out.println("Account.validateAccountDetails() END");
		return isValid;
	}
}

package com.koewala.exception1;

public class BankApplication {

	public static void main(String[] args) 
	{
		BankAccount bank = new BankAccount();
		String accountNo = "BOI_123456";
		String customerName = "Mr Rahul";
		String addresses[] = {"BTM Bangalore", "JP Nagar Bengalore"};
		bank.activeAccount(accountNo , customerName , addresses);

	}
}

class BankAccount
{
	void activeAccount(String accountNo, String customerName, String[] addresses)
	{
		System.out.println("BankAccount.activeAccount() START");
		validateAccountDetails(accountNo, customerName, addresses);
		
		System.out.println("BankAccount.activeAccount() COMPLETE");	
	}
	
	boolean validateAccountDetails(String accountNo, String customerName, String[] addresses)
	{
		boolean isValid = false;
		try {
			String homeAddress = addresses[1]; 
			System.out.println("Home Address: " + homeAddress);
			
		  isValid = customerName.startsWith("Mrs");
		  int transactionLimit = 10000;
		  int divisor = 5;
		  int total = transactionLimit / divisor;
		  int accountNumber = Integer.parseInt(accountNo);
			
		  System.out.println(total);
		  System.out.println(accountNumber);
			
		} catch (NullPointerException e) 
		{
			System.out.println("Name contain null");
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Accessing invalid index that does not exist...");
			e.printStackTrace();
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception cannot / by zero");
			e.printStackTrace();
		}
		
		catch (NumberFormatException e) 
		{
			System.out.println("Number cannot be convert into string");
			e.printStackTrace();
		}
		
		catch (Exception e) 
		{
			System.out.println("Unknown error");
			e.printStackTrace();
		}
		System.out.println("BankAccount.validateAccountDetails() COMPLETED");
		return isValid;
	}
}

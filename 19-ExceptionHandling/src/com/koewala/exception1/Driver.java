package com.koewala.exception1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main() START");

		Account account = new Account();
		String accNo = "BOI_467899";
		String address[] = { "BTM Bangalore", "JP Nagar Bangalore" };
		account.doActiveAcc(accNo, address);

	}
}

class Account {
	void doActiveAcc(String accNo, String address[]) {
		System.out.println("Account.doActiveAcc() START");

		validateAccDetails(accNo, address);
		System.out.println("Account.doActiveAcc() END");
	}

	boolean validateAccDetails(String accNo, String address[]) {

		System.out.println("Account.validateAccDetails() START");
		System.out.println("Validating account details...");
		System.out.println("Checking account status...");

		int accountType = 1;
		String bankName = "State Bank of India";
		boolean isActive = true;

		System.out.println("Account Type: " + accountType);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Active: " + isActive);
		boolean isValid = false;

		try {
            String homeAddress = address[1];
            System.out.println("Home Address: " + homeAddress);
			isValid = accNo.startsWith("BOI");
			int amount = 100 / 5;
			int accNoInt = Integer.parseInt(accNo);
		} catch (NullPointerException e) {
             System.out.println("Value is null");
             e.printStackTrace();
             
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("You are trying to get an values from invalide index");
			e.printStackTrace();
			
		} catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException .. number / by zero");
			e.printStackTrace();
		} catch (Exception e) 
		{
			System.out.println("UnKnown error...");
			e.printStackTrace();
		}
		System.out.println("Account validation completed");
		System.out.println("Account.validateAccDetails() END");
		return isValid;
	}
}

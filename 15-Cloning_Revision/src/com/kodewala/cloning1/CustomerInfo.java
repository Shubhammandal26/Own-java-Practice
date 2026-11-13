package com.kodewala.cloning1;

public class CustomerInfo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		AccountDetails accountDetails = new AccountDetails("12345", 50000);
		Customer custo = new Customer("101", "Rahul", accountDetails);
		
		Customer clonedCusto = (Customer) custo.clone();
		
		System.out.println("Original Customer: ");
		System.out.println("Customer ID: " + custo.customerId);
		System.out.println("Customer Name: " + custo.customerName);
		System.out.println("Account Details: " + accountDetails.accountNumber);
		System.out.println("Balance: " + accountDetails.balance);
		
		clonedCusto.customerName = "Amit";
		clonedCusto.accountDetails.balance = 75000;
		
		System.out.println("Cloned Customer: ");
		System.out.println("Customer ID: " + clonedCusto.customerId);
		System.out.println("Customer Name: " + clonedCusto.customerName);
		System.out.println("Account Number: " + accountDetails.accountNumber);
		System.out.println("Balance: " + clonedCusto.accountDetails.balance);
		
		System.out.println("Original Customer After Cloning: ");
		System.out.println("Customer Name: " + clonedCusto.customerName);
		System.out.println("Balance: " + accountDetails.balance);

	}

}

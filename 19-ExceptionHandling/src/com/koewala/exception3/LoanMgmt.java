package com.koewala.exception3;

public class LoanMgmt 
{
	public void applyLoan(String customerId, String name, double loanAmount) throws Exception
	{
		System.out.println("LoanMgmt.applyLoan() START");
		
		validateCustomer(customerId);
		
		System.out.println("LoanMgmt.applyLoan() END");
	}
	
	
	private void validateCustomer(String customerId) throws Exception
	{
		System.out.println("LoanMgmt.validateCustomer() START");
		
		checkCustomerStatus(customerId);
		System.out.println("LoanMgmt.validateCustomer() END");
	}
		
	private boolean checkCustomerStatus(String customerId)
	{
		try
		{
		customerId.startsWith("SH");
		}
		catch (NullPointerException e) 
		{
		  throw new NullPointerException("Customer ID cannot be null");	
		}
		return false;
	}
}

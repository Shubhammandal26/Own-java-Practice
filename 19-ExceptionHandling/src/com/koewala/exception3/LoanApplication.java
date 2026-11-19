package com.koewala.exception3;

public class LoanApplication {

	public static void main(String[] args) 
	{
		LoanMgmt loan;
		try {
			loan = new LoanMgmt();
			loan.applyLoan(null, "shubham", 500000);
		} catch (Exception e)
		{	
			e.printStackTrace();
		}

	}

}

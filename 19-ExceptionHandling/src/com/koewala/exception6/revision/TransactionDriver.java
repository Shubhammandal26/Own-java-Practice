package com.koewala.exception6.revision;

public class TransactionDriver {

	public static void main(String[] args) 
	{
		Transaction trans = new Transaction("TNX101", "ACC202", "DEPOSIT", 25000);
		
		TransactionReportService service = new TransactionReportService();
		service.generateReport(trans);

	}

}

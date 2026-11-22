package com.koewala.exception6.revision;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TransactionReportService 
{
	public void generateReport(Transaction transaction)
	{
		String fileName = "transactionReport.txt";
		
		try(FileWriter fileWriter = new FileWriter(new File(fileName)))
		{
			fileWriter.write("Transaction ID: " + transaction.transactionId + "\n");
			fileWriter.write("Account Number : " + transaction.accountNumber + "\n");
			fileWriter.write("Transaction Type: " + transaction.transactionType + "\n");
			fileWriter.write("Transaction Amount: " + transaction.amount + "\n");
			
			System.out.println("Transaction Sucessfully");
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}

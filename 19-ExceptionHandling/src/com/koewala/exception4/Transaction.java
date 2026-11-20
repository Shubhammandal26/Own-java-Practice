package com.koewala.exception4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Transaction {

	public static void main(String[] args) 
	{
		String fileName = "transaction_report.txt";
		
		try (FileWriter write = new FileWriter(new File(fileName)))
		{
			String transaction_Id = "TXN101";
			String accountNumber = "ACC1001";
			String transactionType = "Fund Transfer";
			int amount = 15000;
			String  status = "SUCCESS";
			
			write.write("Transaction ID: " + transaction_Id + "\n");
			write.write("Account Number: " + accountNumber + "\n");
			write.write("Transaction Type: " + transactionType + "\n");
			write.write("Amount: " + amount + "\n");
			write.write("Status: " + status + "\n");
			
			System.out.println("Transaction report generated successfully");
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}

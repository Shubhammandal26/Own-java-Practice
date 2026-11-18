package com.koewala.exception2;

public class InvoiceService 
{
	
	public void generateInvoice()
	{
		try {
			connectDatabase();
			String name = "dfghd";
			name.lastIndexOf("a");
			System.out.println("Generating an invoice...");
			System.exit(0);
			 closeDbConnection();
		} catch (Exception e) 
		{
			System.out.println("Some Exception");
			e.printStackTrace();
		} finally {
			System.out.println("I am inside finally block...");
		}
	}
	

	private void connectDatabase()
	{
		
	}
	
	private void closeDbConnection()
	{
		
	}
}

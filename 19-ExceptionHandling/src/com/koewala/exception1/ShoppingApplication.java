package com.koewala.exception1;

public class ShoppingApplication {

	public static void main(String[] args) 
	{
		 OrderService service = new OrderService();
		 
       String customerName = "Rahul";
       String productName = null;
       int quantity = 5;
       int stock = 3;
       double price = 500.0;
       
       service.placeOrder(customerName, productName, quantity, stock, price);
       
	}
}

class OrderService
{
	void placeOrder(String customerName, String productName, int quantity, int stock, double price)
	{
		System.out.println("OrderService.placeOrder() STARTED");
		
		validateOrder(customerName, productName, quantity, stock, price);
		
		System.out.println("OrderService.placeOrder() END");
		
	}
	
	boolean validateOrder(String customerName, String productName, int quantity, int stock, double price)
	{
		boolean isValid = false;
		try {
			isValid = customerName.isEmpty();
			productName.charAt(0);
			int total = 10000 / (stock - quantity);
			int quant = Integer.parseInt(String.valueOf(quantity));
			System.out.println(total);
		} 
		catch(NullPointerException e)
		{
			System.out.println("Name is null...");
			e.printStackTrace();
			
		} catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("");
			e.printStackTrace();
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception can / by zero");
			e.printStackTrace();
		}
		
		catch (NumberFormatException e) 
		{
			System.out.println("Number must be in number format");
			e.printStackTrace();
		}
		
		catch (Exception e) 
		{
			System.out.println("Unknown error");
			e.printStackTrace();
		}
		System.out.println("OrderService.validateOrder() COMPLETED");
		return isValid;
	}
}
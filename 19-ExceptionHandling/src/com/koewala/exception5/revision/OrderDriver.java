package com.koewala.exception5.revision;

public class OrderDriver {

	public static void main(String[] args) throws MinimumOrderAmountException 
	{
	  OrderService service = new OrderService();
	  try
	  {
		 service.placeOrder(5, 10, 2000); 
		 
	  } catch (InvalidQuantityException e) 
	  {
		e.printStackTrace();
		
	} catch (ProductOutOfStockException e) 
	  {
		e.printStackTrace();
		
	} catch (MinimumOrderAmountException e) 
	  {
		e.printStackTrace();
	}

	}

}

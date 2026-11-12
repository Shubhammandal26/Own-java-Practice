package com.revision.oops;

public interface IOrder
{
	void placeOrder(double amount);
	static boolean isValidAmount(double amount)
	{
		if(amount > 0) {
			return true;
	} 
	else {
		System.out.println("Invalid  amount");
		return false;
	}
}

}

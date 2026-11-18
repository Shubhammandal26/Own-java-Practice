package com.koewala.exception2;

public class OrderService 
{
	public int calculateOrderAmount() {

        int amount = 10000;

        try {
            System.out.println("Processing order...");
            amount = amount - 2000;

            int result = 10 / 0;

            return amount;

        } catch (ArithmeticException e) {
            System.out.println("Payment calculation failed...");
            return amount;

        } finally {
            System.out.println("Closing order resources...");
            amount = 3000;
        }
    }


}

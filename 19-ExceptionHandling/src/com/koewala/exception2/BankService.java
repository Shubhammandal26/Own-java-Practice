package com.koewala.exception2;

public class BankService 
{
	public int withdrawAmount() {

        int balance = 50000;

        try {
            balance = balance - 10000;
            System.out.println("Withdrawal successful...");
            return balance;

        } catch (Exception e) {
            System.out.println("Transaction failed...");
            return 0;

        } finally {
            balance = balance - 5000;
            System.out.println("Transaction completed...");
        }
    }
  
}

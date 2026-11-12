package com.revision.oops;

public class BankNotification implements IBankNotification
{
	public static void main(String[] args) {
		BankNotification bank = new BankNotification();
		bank.sendEmailNotification();
		bank.sendSMSNotification();
	}
}

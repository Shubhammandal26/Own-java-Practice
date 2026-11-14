package com.kodewala.open;

public interface IPayment 
{
  void	processPayment(double amount);
}

class CreditCardPayment implements IPayment
{
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Payment through Credit Card: " + amount);	
	}
}
class DebitCardPayment implements IPayment
{
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Payment through Debit Card: " + amount);
		
	}
}

class UPIPayment implements IPayment
{
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Payment through UPI: " + amount);
		
	}	
}

class NetBankingPayment implements IPayment
{
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Payment through Net Banking: " + amount);
		
	}	
}

class WalletPayment implements IPayment
{
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Payment through wallet: " + amount);
		
	}
}

class PaymentsService
{
	public void doPayment(IPayment payment, double amount)
	{
		payment.processPayment(amount);
	}
}

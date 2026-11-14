package com.kodewala.open;

public class OnlinePayment {

	public static void main(String[] args) 
	{
		PaymentsService service = new PaymentsService();
		service.doPayment(new CreditCardPayment(), 25000);
		service.doPayment(new DebitCardPayment(), 15000);
		service.doPayment(new UPIPayment(), 20000);
		service.doPayment(new NetBankingPayment(), 10000);
		service.doPayment(new WalletPayment(), 12000);

	}

}

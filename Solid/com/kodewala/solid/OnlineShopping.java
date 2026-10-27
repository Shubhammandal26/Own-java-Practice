
   package com.kodewala.solid;
   
   class OnlineShopping
   {
   public static void main(String[] args)
   {
     OrderServices  orders = new  OrderServices();
	 orders.calculateTotal(500, 3);
	 
	 SavingOrder saving = new SavingOrder();
	 saving.saveOrder("Odr123");
	 
	 SendingEmail email = new SendingEmail();
	 email.sendConfirmationEmail("rahul@gmail.com");
   
   }
   }
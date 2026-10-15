
   package com.kodewala.inheritance;
   
   class Account
   {
    public void openBankAccount(String name, String address, String type)
	{
	 System.out.println("Account.openBankAccount()..." + name + address + type);
	}
   }
   class AccountSaving extends Account
   {
     public void openSavingAccount(String name, String address, String type)
	 {
	  openBankAccount(name, address, type);
	 }
   }
   
   class Driver 
   {
   public static void main(String[] args)
   {
     AccountSaving accountSaving = new AccountSaving();
	 accountSaving.openBankAccount("Shubham", " BTM Layout", " Saving");
   }
   }
  
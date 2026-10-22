

     package com.kodewala.polymorphism;
	 
	 class User
	 {
	   public void doSomething()
	   {
	   System.out.println("User is performing an action");
	   }
	 }
	 
	 class AdminUser extends User {
    @Override
    public void doSomething() {
        System.out.println("Admin is managing users");
    }
}

class FinacUser extends User {
    @Override
    public void doSomething() {
        System.out.println("Finance user is managing payments");
    }
}

public class Driver {
    public static void main(String[] args) {

        User user1 = new AdminUser();
        User user2 = new FinacUser();

        user1.doSomething();
        user2.doSomething();
    }
}

    package com.kodewala.polymorphism;
   class User1 {
    public void login() {
        System.out.println("User login");
    }
    }

     class AdminUser1 extends User1 {
    public void manageUsers() {
        System.out.println("Managing users");
    }
      }

      public class Driver1 {
     public static void main(String[] args) {
        User1 user = new AdminUser1();

        user.login();
       // user.manageUsers(); // down casting
		
		AdminUser1 admin = (AdminUser1) user;
		admin.manageUsers();
      }
     }

 package com.kodewala.solid;
 
 class OrderServices 
 {
  public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Total: " + total);
 }
 }
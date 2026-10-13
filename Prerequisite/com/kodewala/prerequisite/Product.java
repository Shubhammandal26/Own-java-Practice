
     package com.kodewala.prerequisite;

   class Product {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    Product() {
        System.out.println("Default constructor");
    }

    Product(int price) {
        System.out.println("Parameterized constructor: " + price);
    }

    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product(500);

        Product p3 = new Product();
    }
}
    // output -> Static block, Instance block, Default constructor,Instance block,Parameterized constructor: 500, 
    //	Instance block, Default constructor
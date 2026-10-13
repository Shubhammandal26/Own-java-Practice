   package com.kodewala.prerequisite;
   class Demo1 {

    static {
        System.out.println("Static");
    }

    {
        System.out.println("Instance");
    }

    Demo1() {
        this(100);
        System.out.println("Default constructor");
    }

    Demo1(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
    }
}
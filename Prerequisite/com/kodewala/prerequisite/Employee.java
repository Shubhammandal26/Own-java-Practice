
   package com.kodewala.prerequisite;
   
   class Employee {

    static int count = 0;

    static {
        count = 10;
        System.out.println("Static block: " + count);
    }

    {
        count++;   // 11
        System.out.println("Instance block: " + count);
    }

    Employee() {
        count++;  // 12
        System.out.println("Constructor: " + count);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee();

        System.out.println("Final count: " + count);
    }
}
    // output -> Static block: 10, Instance block: 11, Constructor: 12, Instance block: 13, Constructor: 14, Final count: 14
  package com.kodewala.prerequisite;
   
   class Parent {

    static {
        System.out.println("Parent static");
    }

    {
        System.out.println("Parent instance");
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    static {
        System.out.println("Child static");
    }

    {
        System.out.println("Child instance");
    }

    Child() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {

        Child c1 = new Child();

        System.out.println("----");

        Child c2 = new Child();
    }
}

   // output --> Parent static, Child static, Parent instance, Child instance, Parent constructor, Child constructor, ----,
   // Parent instance, Child instance, Parent constructor, Child constructor 
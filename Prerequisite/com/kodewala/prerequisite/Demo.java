
   package com.kodewala.prerequisite;
  
    class Demo {

    static {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }

    Demo() {
        System.out.println("C");
    }

    public static void main(String[] args) {

        System.out.println("D");

        Demo d1 = new Demo();

        System.out.println("E");

        Demo d2 = new Demo();
    }
}
  // output - A, D, B,C, E, B, C
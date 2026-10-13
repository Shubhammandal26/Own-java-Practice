  
  package com.kodewala.prerequisite;

   class Student {

    static {
        System.out.println("Static 1");
    }

    {
        System.out.println("Instance 1");
    }

    Student() {
        System.out.println("Constructor 1");
    }

    static {
        System.out.println("Static 2");
    }

    {
        System.out.println("Instance 2");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
    }
}
     // Output - Static 1, Static 2 ,Instance 1, Instance 2, Constructor 1,Instance 1, Instance 2, Constructor 1  
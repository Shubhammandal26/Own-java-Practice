package com.revision.oops;

class Animal 
{
    void eat() 
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Test {
    public static void main(String[] args) {

        Animal animal = new Dog();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        } else {
            System.out.println("Not a Cat");
        }
    }
}
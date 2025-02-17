package org.annotations.builtinannotation;
//Exercise 1: Use @Override Correctly
//✅ Problem Statement:
//Create a parent class Animal with a method makeSound(). Then, create a Dog class that overrides this method using @Override.
//🔹 Steps to Follow:
//Define a makeSound() method in Animal class.
//Override it in Dog class with @Override.
//Instantiate Dog and call makeSound().
class Animal {
    //Define a makeSound() method in Animal class.
    void makeSound(){
        System.out.println("meow meow");
    }
}
public class Dog extends Animal{
    //Override it in Dog class with @Override.
    @Override
    void makeSound(){
        System.out.println("bark bark");
    }

    public static void main(String[] args) {
        //Instantiate Dog and call makeSound().
        Dog dog = new Dog();
        dog.makeSound();
    }
}

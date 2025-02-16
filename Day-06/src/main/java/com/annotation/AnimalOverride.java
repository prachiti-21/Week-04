package com.annotation;
class Animal{
    public  void makeSound(){}
}
class Dog extends Animal{
    @Override
    public  void makeSound(){
        System.out.println("Bark!");
    }
}
public class AnimalOverride {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

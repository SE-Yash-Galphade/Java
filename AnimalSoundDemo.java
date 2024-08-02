package com.google.yash;

public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal1 animal = new Dog();
        animal.sound();
        animal.eat();

        animal = new Cat();
        animal.sound();
        animal.eat();
    }
}

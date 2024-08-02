package com.google.yash;

public class Dog extends Animal1 {
    @Override
    public void sound() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dog food.");
    }
}

package com.google.yash;

public class Cat extends Animal1 {
    @Override
    public void sound() {
        System.out.println("The cat is meowing.");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating cat food.");
    }
}

package com.google.yash;

public class Animal {
 String sound = " generic animal sound";

 public void makeSound() {
     System.out.println(sound);
 }
}

public class  extends Animal {
 String sound = "Woof!";

 public void makeSound() {
     System.out.println(sound);
 }

 public void makeSuperSound() {
     super.makeSound(); // calls the makeSound() method of the superclass (Animal)
 }
}


public class SuperClassDemonstration {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.makeSound(); 
     dog.makeSuperSound();
 }
}

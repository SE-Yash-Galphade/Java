package com.google.yash;

public class ConstructorOverloadingDemo {
 public static void main(String[] args) {
     // Create a Rectangle object using the no-argument constructor
     Rectangle rect1 = new Rectangle();
     System.out.println("Rectangle 1: Area = " + rect1.getArea() + ", Perimeter = " + rect1.getPerimeter());

     // Create a Rectangle object using the one-argument constructor
     Rectangle rect2 = new Rectangle(5);
     System.out.println("Rectangle 2: Area = " + rect2.getArea() + ", Perimeter = " + rect2.getPerimeter());

     // Create a Rectangle object using the two-argument constructor
     Rectangle rect3 = new Rectangle(4, 6);
     System.out.println("Rectangle 3: Area = " + rect3.getArea() + ", Perimeter = " + rect3.getPerimeter());
 }
}

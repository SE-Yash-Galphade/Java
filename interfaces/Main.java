package com.google.yash.interfaces;

public class Main {
 public static void main(String[] args) {
     // Create a circle and a rectangle
     Circle circle = new Circle(5.0);
     Rectangle rectangle = new Rectangle(4.0, 6.0);

     // Calculate and print the area and perimeter of each shape
     System.out.println("Circle:");
     System.out.println("Area: " + circle.calculateArea());
     System.out.println("Perimeter: " + circle.calculatePerimeter());

     System.out.println("\nRectangle:");
     System.out.println("Area: " + rectangle.calculateArea());
     System.out.println("Perimeter: " + rectangle.calculatePerimeter());
 }
}
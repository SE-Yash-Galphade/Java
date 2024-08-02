package com.google.yash.interfaces;

public class Circle implements shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 public double calculateArea() {
     return Math.PI * Math.pow(radius, 2);
 }

 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

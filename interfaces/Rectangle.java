package com.google.yash.interfaces;

public class Rectangle implements shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 public double calculateArea() {
     return length * width;
 }
 
 public double calculatePerimeter() {
     return 2 * (length + width);
 }
}
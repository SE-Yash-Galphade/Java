package com.google.yash;

public class MethodOverlaodingDemo {
	
		 public static int add(int a, int b) {
		     return a + b;
		 }

		 public static int add(int a, int b, int c) {
		     return a + b + c;
		 }

		 public static double add(double a, double b) {
		     return a + b;
		 }

		 public static String add(String str, int num) {
		     return str + num;
		 }
	
 public static void main(String[] args) {
//     Calculator calculator = new Calculator;

     int result1 = add(10, 20);
     System.out.println("Result 1: " + result1);

     int result2 = add(10, 20, 30);
     System.out.println("Result 2: " + result2);

     double result3 = add(10.5, 20.7);
     System.out.println("Result 3: " + result3);

     String result4 = add("Hello, ", 20);
     System.out.println("Result 4: " + result4);
 }
}

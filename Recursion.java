package com.google.yash;

public class Recursion {

	public static void main(String[] args) {
		 
		int n = 10;
		int a;
		
		a = factorial(10);
		System.out.println("Factorial of " + n + " is " + a);
		
		
	}
	
	private static int factorial (int n) {
		if(n<=0) {
			return -1;
		}
		else {
			return n * factorial(n-1);
		}
	}
}

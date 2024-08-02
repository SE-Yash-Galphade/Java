package com.google.yash;

public class MethodsInJava {
	
	public static void main(String[] args) {
		
		int sum = sum(1,2);
		printtoconsole(sum);
		printtoconsole(sum(2.1, 5.6));
		print("Yash");
		
	}
	
	
	private static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	private static double sum(double a, double b) {
		return a + b;
	}
	
	private static void print(String text) {
		System.out.println(text);
	}
	
	private static void printtoconsole(int i) {
		System.out.println(i);
	}
	
	private static void printtoconsole(double i) {
		System.out.println(i);
	}
	
	
	
}

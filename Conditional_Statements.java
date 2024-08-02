package com.google.yash;

public class Conditional_Statements {
	
	public static void main(String[] args) {
		
		System.out.println("========If-Else Condition===========\n");
		
		int amountofmoney = 200;
		int itemprice = 300;
		
		if (amountofmoney < itemprice) {
			System.out.println("You cannot buy this product.");
		}
		else {
			System.out.println("You can buy this product");
		}
		
		System.out.println("\n=============Nested if-Condition=============\n");

		int a = 30;
		int b = 20;
		int c = 10;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is the largest among all.");
			}
			else {
			System.out.println("a is greater than b but not greater than c.");
			}
		}
		
		
		System.out.println("\n=============if-else-if Condition=============\n");

		int orderprice = 150;
		
		if(orderprice>0 && orderprice<=100) {
			System.out.println("You can avail 5% Discount.");
		}
		else if(orderprice>100 && orderprice<=200) {
			System.out.println("You can avail 10% Discount.");
		}
		else if(orderprice>200 && orderprice<=300) {
			System.out.println("You can avail 15% Discount.");
		}
		else if(orderprice>300 && orderprice<=400) {
			System.out.println("You can avail 20% Discount.");
		}
		
		
	}
}

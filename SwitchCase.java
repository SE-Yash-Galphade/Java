package com.google.yash;

public class SwitchCase {
	
	public static void main(String[] args) {
		 
		String customerStatus = "Premium_Customer";
		
		switch (customerStatus) {
		case "guest":
			System.out.println("Thank you for your order.");
			break;
		case "regular_Customer":
			System.out.println("Thank You for your purchase. Take 10% discount for your order"
					+ " as a gratitude for staying with us.");
			break;
		case "Premium_Customer":
			System.out.println("Wow! You are our Premium Customer! Just take all order"
					+ " for 1 USD.");
			break;
		default:
			System.out.println("Customer doesn't have status set.");
		}
		
		
	}
}

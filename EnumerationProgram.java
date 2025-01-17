package com.google.yash;

import java.util.Scanner;

public class EnumerationProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();
			
			if (isValidMessageTpe(userInput)) {
				MessageType messagetype = MessageType.valueOf(userInput.toUpperCase());
				System.out.println(messagetype.getPriority());
				break;
			}
			else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}
			
		}
		
		
	}
	
	private static boolean isValidMessageTpe(String userInput) {
		
		return userInput.equalsIgnoreCase("a") || userInput.equalsIgnoreCase("b") || 
				userInput.equalsIgnoreCase("c") || 					
				userInput.equalsIgnoreCase("d"); 	
		
	}
}

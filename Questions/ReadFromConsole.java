package com.google.yash.Questions;

import java.util.Scanner;

public class ReadFromConsole {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Character or String: ");
		String word = sc.next();
		System.out.println("The Word you've entered is " + word);
		System.out.println("Enter Any Number: ");
		int i = sc.nextInt();
		System.out.println("The Integer you've entered is " + i);
		
	}
}

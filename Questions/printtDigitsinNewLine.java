package com.google.yash.Questions;

import java.util.Scanner;

public class printtDigitsinNewLine {

	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (char digit : str.toCharArray()){
		    System.out.println(digit);
		}
    }
   
}

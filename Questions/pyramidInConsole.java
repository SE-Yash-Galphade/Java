package com.google.yash.Questions;

import java.util.*;

public class pyramidInConsole {
	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		
		for (int i = 1; i < height + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}*
		for (int i = height - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
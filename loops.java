package com.google.yash;

import java.util.*;

public class loops {
	
	public static void main(String[] args) {
		
		System.out.println("========While Loop========");
		int counter = 0;
		while (counter < 5) {
			System.out.println("Counter = " + counter++);
		}
		
//		infinite loop
//		while(true) {
//			
//		}
		
		System.out.println("========do-while Loop========");
		int counter1 = 0;
		
		do {
			System.out.println("Counter = " + counter1++);
		} while(counter1 < 5);
		
		do {
			System.out.println("Counter is five already.." + counter1);
		} while(counter1 < 5);
		
		
		
		
		
		System.out.println("========for Loop========");
		
		for (int i=0; i<5 ; i++) {
			System.out.println("Counter = " + i );
		}
		
		
//		Infinite loop
//		for(;;) {
//			
//		}
		
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("Counters: i = " + i + " , j = " + j);
		}
		
		
		
		System.out.println("========for each Loop========");
		int[] arr = {1,2,3,4};
		int sum = 0;
		
		for (int number : arr) {
			sum = sum + number; 	// sum += number can also be written
			System.out.println("Number = " + number);
		}
		System.out.println("Sum = " + sum);
		
		
		System.out.println("========Nested Loop========");
		
		for(int i=0;i<5;i++) {
			System.out.println("i = " + i);
			for(int j=0;j<3;j++) {
				System.out.println(j + "\t");
			}
		}
		
		
		
		
		
	}
}

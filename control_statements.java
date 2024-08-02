package com.google.yash;

public class control_statements {
	
	public static void main(String[] args) {
		
		System.out.println("========Continue Statement========");
		
		for(int i=0;i<10;i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println("Counter = " + i);
		}
		
		System.out.println("========Break Statement========");
		
		for(int i=0;i<5;i++) {
			System.out.println("i = " + i);
			for(int j=0;j<3;j++) {
				if(j==3) {
					break;
				}
				System.out.println("j = " + j);
			}
		}
		
		
		
		
		
	}
	
}

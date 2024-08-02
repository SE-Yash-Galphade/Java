package com.google.yash;

public class NewRefactoringDemo {

	public static void main(String[] args) {
		NewRefactoringDemo r = new NewRefactoringDemo();
		
//		 Refactoring = alt + shift + r
		
//		Formatting = ctrl + shift + f
		
//		Variable or expression Separation:
//			alt + shift + L
		
		printToConsole();
		
//		System.out.println(Arrays.toString(new String[] {"Apple", "Banana", "Cherry"}));
//		Import Optimization = alt + shift + o
		int counter=0;
		System.out.println(counter++);

	}

	private static void printToConsole() {
//		Code to method = alt + shift + m
		int sum = 10+5;
		System.out.println(sum);
		System.out.println(sum);
	}

}

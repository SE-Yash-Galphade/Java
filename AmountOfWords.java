package com.google.yash;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	    
	    String input = sc.nextLine();
	    
	    int amountOfWords = getWordsAmount(input);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		return text.split("[\\p{P}\\s]+").length;
	}
}
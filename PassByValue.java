package com.google.yash;

import java.util.Arrays;

public class PassByValue {
	
	public static void main(String[] args) {
		int i = 10;
		
		changeValue(i);
		System.out.println(i);
		
		int a = ChangeInt(i);
		System.out.println(a);
		
		int[] array = {1, 2, 3};
		System.out.println(Arrays.toString(array));
		changeArray(array);

		clearArray(array);
		
	}
	
	private static void changeValue(int i) {
		i += 100;
	}
	
	private static int ChangeInt(int i) {
		i += 100;
		return i;
	}
	
	private static void changeArray(int[] array) {
		array[1] = 200;
	}
	
	private static void clearArray(int[] array) {
		array = null;
	}
}

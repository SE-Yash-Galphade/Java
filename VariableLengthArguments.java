package com.google.yash;

public class VariableLengthArguments {

	public static void main(String... args) {
		
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

		
	}
	
	private static int sum (int i1, int i2) {
		return i1 + i2;
	}

	private static int sum (int i1, int i2, int i3) {
		return i1 + i2 + i3;
	}

	private static int sum (int... ints ) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		return sum;
	}
	
}

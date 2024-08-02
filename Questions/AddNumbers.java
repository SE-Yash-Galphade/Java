package com.google.yash.Questions;

public class AddNumbers {

	public static void main(String[] args) {
		
		if (args[0].contains(".") || args[1].contains(".")) {
			double paramdouble1 = Double.parseDouble((args[0]));
			double paramdouble2 = Double.parseDouble(args[1]);
			System.out.println(paramdouble1 + paramdouble2);
		}
		else {
			int paramInt1 = Integer.parseInt(args[0]);
			int paramInt2 = Integer.parseInt(args[1]);
			System.out.println(paramInt1 + paramInt2);
		}
				
		
		
	}
}

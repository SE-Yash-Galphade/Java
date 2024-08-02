package com.google.yash;

public class EnumDemo {

	public static void main(String[] args) {
		
		Priority priority = Priority.HIGH;
		 
		switch (priority) {
			case HIGH:
				System.out.println("High Priority");
				break;
			case MEDIUM:
				System.out.println("Medium Priority");
				break;
			case LOW:
				System.out.println("Low Priority");
				break;
		}
		
		System.out.println("------Enum ValueOf()");
		
		Priority priority2 = Priority.valueOf("MEDIUM");
		System.out.println(priority2);
		
		System.out.println("-------Enum Comparison");
		
		System.out.println(priority == Priority.MEDIUM);
		System.out.println(priority == Priority.HIGH);
		
		
		System.out.println("-----------Enum Ordinal()");
		
		System.out.println(Priority.HIGH.ordinal());
		System.out.println(Priority.MEDIUM.ordinal());
		System.out.println(Priority.LOW.ordinal());
		
		
		System.out.println("------------Enum Iterations");
		
		Priority[] values = Priority.values();
		for (Priority priority3 : values) {
			System.out.println(priority3);
		}
		
		
		System.out.println("------------Enum Fields and Methods");
		
		System.out.println(Month.NOVEMBER.getDaysAmount());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

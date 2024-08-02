package com.google.yash;

public class StaticDemonstration {
	static int staticVar = 10;
	int var = 20;
	
	public static void staticMethod() {
		System.out.println("This is a Static Method");
	}
	
	public void nonStaticMethod() {
		System.out.println("This is a Non-Static Method");
	}
	
	public static void main(String[] args) {
		// Accessing the static method and static variable without creating the object.
		System.out.println("Static Variable: " + staticVar);
		
		staticMethod();
		
		StaticDemonstration obj = new StaticDemonstration();
		
		obj.nonStaticMethod();
		
		System.out.println(obj.var);
		
	}
	
	
}

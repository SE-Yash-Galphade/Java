package com.google.yash;

import java.io.DataInputStream;

class DataInputStream {
	public static void main (String[] args) {
		try{
			DataInputStream dt = new DataInputStream(System.in);
			int x = 0;
			float y = 0.0f;

			System.out.println("Enter an Integer Value: ");
			x = Integer.parseInt(dt.readline());

			System.out.println("Enter a Floating Point Number: ");
			y = Float.valueOf(dt.readline()).floatValue();

			System.out.println("Product of x: " + x + " and y: " + y + " is " + x*y);
	
}
catch (Exception e)
{}
}}


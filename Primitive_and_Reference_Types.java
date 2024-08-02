package com.google.yash;
 
import java.util.Arrays;


public class Primitive_and_Reference_Types {
	
	public static void main(String[] args) {
		
		Integer i = 128;
		Integer i2 = 128;
		System.out.println(i == i2);	// False
		
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3 == i4);	// True
		
		Integer i5 = new Integer(127);
		Integer i6 = new Integer(127);
		System.out.println(i5 == i6);	// False
		
		Integer i7 = Integer.valueOf(127);
		Integer i8 = Integer.valueOf(127);
		System.out.println(i7 == i8);		// true
		
		System.out.println(i.equals(i2));	// true
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		System.out.println(arr1 == arr2);	//false
		System.out.println(arr1.equals(arr2));		// false
		System.out.println(Arrays.equals(arr1, arr2));		// true
		
		
	}
}

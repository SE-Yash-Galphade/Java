package com.google.yash;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class String_Concept {
	
	public static void main(String[] args) {
		
		System.out.println("===== String methods =====");
		System.out.println();
		
		String y = "Yash ";
		System.out.println(y.length());
		System.out.println(y.contains("y"));
		System.out.println(y.isEmpty());
		System.out.println(y.toUpperCase());
		System.out.println(y.toLowerCase());
		System.out.println(y.startsWith(" y "));
		System.out.println(y.endsWith(" "));
		System.out.println(y.replace("Yash", "yASH"));
		System.out.println(y.trim());
		System.out.println(y.strip());
		System.out.println(y.substring(1,3));
		System.out.println(Arrays.toString(y.getBytes()));
		System.out.println(Arrays.toString(y.toCharArray()));
		System.out.println(Arrays.toString(y.split("a")));
		System.out.println(y);
		
		System.out.println("===== String Comparison =====");
		String y2 = " Yash ";
		System.out.println(y == y2);
		
		String y3 = new String(" Hello ");
		System.out.println(y2 == y3);
		
		System.out.println(y2.equals(y3));
		System.out.println(y2 == y3.intern());
		
		String first = "Yash";
		String second = "yash";
		
		System.out.println(first.equals(second));
		System.out.println(first.equalsIgnoreCase(second));
		
		System.out.println("===== Escape Sequence Characters =====");
		
		System.out.println("My Favourite book is \"This\" and i know.");
		System.out.println("Path to be printed: D:\\Java\\Eclipse\\sources");
		System.out.println("Some text Line 1 \nSome text line 2");
		System.out.println("Unicode Characters: \u00A9 Yash \n");
		
		
		System.out.println("===== String Formatting =====\n");
		
		String greeting = "Hello, Dear %s! Good %s!";
		
		String firstname = "Yash";
		String morning = "Morning";
		String afternoon = "Afternoon";
		String evening = "Evening";
		String formatted = String.format(greeting, firstname, morning);
		System.out.println(formatted);
		
		System.out.printf("You have %d Computers available at store.\n\n", 7);
		
		
		String gmailpattern = "[a-zA-Z-\\d]+@gmail.com";
		Pattern p = Pattern.compile(gmailpattern);
		String sampleTxt = "Some random text that contains gmail addresses " 
				+ "like this one some-email@gmail.com. And some other random text.";
		Matcher m = p.matcher(sampleTxt);
		
		m.find();
		String gmailaddress = m.group();
		System.out.println(gmailaddress);
		
		String sampletext2 = "There are three sentences in this string. Are you sure? Yes!";
		String[] sentences = sampletext2.split("[\\.?!]");
		
		System.out.println(Arrays.toString(sentences));
		
		
	}
}

package com.google.yash;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;
        int originalNumber = number;

        while (number!= 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}

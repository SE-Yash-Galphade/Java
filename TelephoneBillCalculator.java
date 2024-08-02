package com.google.yash;

import java.util.Scanner;

public class TelephoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter telephone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter number of calls: ");
        int numCalls = scanner.nextInt();

        double billAmount = calculateBillAmount(numCalls);

        System.out.println("Telephone Number: " + phoneNumber);
        System.out.println("Number of Calls: " + numCalls);
        System.out.println("Bill Amount: Rs. " + String.format("%.2f", billAmount));
    }

    public static double calculateBillAmount(int numCalls) {
        double fixedRent = 400.0;
        double excessCallsCharge = 0.0;

        if (numCalls > 150) {
            excessCallsCharge = (numCalls - 150) * 0.80;
        }

        return fixedRent + excessCallsCharge;
    }
}

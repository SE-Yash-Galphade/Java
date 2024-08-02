package com.google.yash;

import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();

        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }

        Arrays.sort(names);

        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

package com.google.yash;

import java.util.Scanner;

public class PersonRecord {
    static class Person {
        double height;
        double weight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            System.out.print("Enter height of person " + (i + 1) + ": ");
            people[i].height = scanner.nextDouble();
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            people[i].weight = scanner.nextDouble();
        }

        int count = 0;
        for (Person person : people) {
            if (person.weight < 50 && person.height > 170) {
                count++;
            }
        }

        System.out.println("Number of people whose weight is less than 50 and height is more than 170: " + count);
    }
}

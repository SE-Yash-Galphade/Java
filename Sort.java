package com.google.yash;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6, 4};

        System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

package com.codegym;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size of the array: ");
            size = input.nextInt();
            if (size < 1) {
                System.out.println("Size is not less than 1.Try again!");
            }
        } while (size < 1);

        double arr[];
        arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value of element %d: ", i + 1);
            arr[i] = input.nextDouble();
        }
        System.out.println("Your entered array: " + Arrays.toString(arr));

        double max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}



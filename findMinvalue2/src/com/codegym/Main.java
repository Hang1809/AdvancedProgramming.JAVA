package com.codegym;

import java.util.Scanner;
import java.util.Arrays;
        public class Main {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int size;
                do {
                    System.out.println("Enter size of the array: ");
                    size = input.nextInt();
                    if ( size < 1 ){
                        System.out.println("Size is not less than 1. Try again. ");
                    }
                } while (size < 1);

                double arr[];
                arr = new double[size];
                for (int i =0 ; i <size; i++){
                    System.out.printf("Enter value of element  : ", i + 1);
                    arr[i] = input.nextDouble();
                }

                System.out.println("Your entered array:" + Arrays.toString(arr));
                System.out.println("Min value in your array is: " +findMinValue(arr));
            }

            public static double findMinValue(double[]array){
                double min = array[0];
                for (int i=1 ; i< array.length; i++){
                    if (array[i] < min){
                        min = array[i];
                    }
                }
                return min;
            }
        }


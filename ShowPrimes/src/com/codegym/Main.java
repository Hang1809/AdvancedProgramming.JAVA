package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter max number that you want to check for prime : ");
        int num = input.nextInt();
        System.out.printf("The prime numbers <%d are: ", num);
        for (int i = 2; i < num; i++) {
            boolean isPrimeNumber = true;
            for (int k = 2; k <i; k++) {
                if (i % k == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.printf("%d ", i);
            }
        }
    }
}

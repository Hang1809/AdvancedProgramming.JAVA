package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" input amount money in USD : ");
        usd = scanner.nextDouble();
        double convert = usd * 23000;
        System.out.print("amount money in Vnd :" +convert );
    }
}

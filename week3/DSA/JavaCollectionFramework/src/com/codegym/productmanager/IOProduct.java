package com.codegym.productmanager;

import com.codegym.productmanager.Product;

import java.util.Scanner;

public class IOProduct {
    public static Product inputProduct() {
        Scanner input = new Scanner(System.in);

        System.out.println("input name product: ");
        String title = input.nextLine();
        System.out.println();
        System.out.println("input price: ");
        double price = input.nextDouble();
        System.out.println("input quantity: ");
        int quantity = input.nextInt();
        System.out.println("input color: ");
        String color = input.nextLine();

        Product product = new Product(title, price, quantity, color);


        return product;
    }
}

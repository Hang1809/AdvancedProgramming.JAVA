package vn.hangdinh.bohoshop.views;

import java.util.Scanner;

public class ProductView {
    static Scanner input = new Scanner(System.in);
    static ManagerProductView productService = new ManagerProductView();

    public static void showMenu() {
        System.out.println("---------------------MENU-----------------------");
        System.out.println("   0. Exit");
        System.out.println("   1. Add Product");
        System.out.println("   2. Edit Product by using ID");
        System.out.println("   3. Remove Product by using ID");
        System.out.println("   4. Show Product List ");
        System.out.println("   5. Find Product by using name");
        System.out.println("   6. Display product ");
        System.out.println("------------------------------------------------");
        System.out.println(" ");
    }

    public static void run() {
        int choice;
        do {
            showMenu();
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Add Product");
                    productService.addNewProduct();
                    break;
                case 2:
                    System.out.println("Edit Product by using ID");
                    productService.editProduct();
                    break;
                case 3:
                    System.out.println("Remove Product by using ID");
                    productService.removeProduct();
                    break;
                case 4:
                    System.out.println("Show Product List");
                    productService.renderProduct();
                    break;
                case 5:
                    System.out.println("Find Product by using name");
                    productService.searchProduct();
                    break;
                case 6:
                    System.out.println("Display product");
                    productService.displayProduct();
                    break;
                case 7:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

            }

        }
        while (choice != 0);

    }
}

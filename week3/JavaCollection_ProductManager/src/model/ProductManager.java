package model;

import comparator.*;
import comparator.ComparatorPriceDESC;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;


public class ProductManager {
    Scanner input = new Scanner(System.in);

    public void showMenu() {
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

    private final List<Product> productList = new ArrayList<Product>();

    public ProductManager() {
        productList.add(new Product("Cardigan", 5, 50, "blue"));
        productList.add(new Product("Hat", 3, 80, "yellow"));
        productList.add(new Product("Socks", 3, 50, "aquamarine"));
        productList.add(new Product("Cardigan", 5, 20, "orange"));
        productList.add(new Product("Towel", 2, 50, "blue"));
    }


    public void renderProduct() {
        System.out.println("------------------------------------------------ PRODUCT LIST ------------------------------------------------------\n");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s \n", "ID", "Product Name", "Price", "Quantity", "Color");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        for (Product product : productList) {
            System.out.printf("%-10s %-15s %-10s %-10s %-10s \n", product.getId(), product.getTitle(),
                    product.getPrice(), product.getQuantity(), product.getColor());
        }
        System.out.println();

    }

    public void addNewProduct() {

        System.out.println("input name product: ");
        String title = input.nextLine();
        System.out.println();
        System.out.println("input price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("input quantity: ");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.println("input color: ");
        String color = input.nextLine();

        productList.add(0, new Product(title, price, quantity, color));
        System.out.println("Item added successfully!");

    }

    public void editProduct() {
        //   renderProduct();
        Scanner input = new Scanner(System.in);
        System.out.println("Search by ID: ");
        int id = Integer.parseInt(input.nextLine());

        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.println("input new name product: ");
                String newTitle = input.nextLine();
                System.out.println();
                System.out.println("input new price: ");
                double newPrice = Double.parseDouble(input.nextLine());
                System.out.println("input new quantity: ");
                int newQuantity = Integer.parseInt(input.nextLine());
                System.out.println("input new color: ");
                String newColor = input.nextLine();

                productList.set(i, new Product((int) productList.get(i).getId(), newTitle, newPrice, newQuantity, newColor));
            }
        }
    }

    public void removeProduct() {
        //  renderProduct();
        System.out.println("Remove by ID :");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }
        System.out.println("Item removed successfully");
    }

    public void searchProduct() {
//        renderProduct();
        int count = 0;
        System.out.println("Find product by name: ");
        String title = input.nextLine().toLowerCase();
        for (Product product : productList){
            if (product.getTitle().toLowerCase().contains(title)) {
                System.out.println(product);
                count ++;
            }
            }
        if (count == 0){
            System.out.println("This product doesn't exist");
        }
    }

    public void displayProduct() {
        int choice;
        do {
                 renderProduct();
            System.out.println("1.Sort by Name(Ascending)");
            System.out.println("2.Sort by Name(Descending)");
            System.out.println("3.Sort by Price(Ascending)");
            System.out.println("4.Sort by Price(Descending)");
            System.out.println("5.Return");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    productList.sort(new ComparatorNameASC());
                    break;
                case 2:
                    productList.sort(new ComparatorNameDESC());
                    break;
                case 3:
                    productList.sort(new ComparatorPriceASC());
                    break;
                case 4:
                    productList.sort(new ComparatorPriceDESC());
                    break;
            }
        } while (choice != 5);
    }
}






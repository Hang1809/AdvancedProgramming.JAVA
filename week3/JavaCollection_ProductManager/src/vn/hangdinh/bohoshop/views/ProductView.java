package vn.hangdinh.bohoshop.views;

import vn.hangdinh.bohoshop.comparator.*;
import vn.hangdinh.bohoshop.comparator.ComparatorPriceDESC;
import vn.hangdinh.bohoshop.model.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class ManagerProductView {
    Scanner input = new Scanner(System.in);

    private final List<Product> productList = new ArrayList<Product>();

    public ManagerProductView() {
        productList.add(new Product("Cardigan", 15, 25, "blue"));
        productList.add(new Product("Headscarves", 3, 30, "yellow"));
        productList.add(new Product("Vintage scarf", 5, 50, "aquamarine"));
        productList.add(new Product("Scarf Hiwaga", 5, 20, "orange"));
        productList.add(new Product("Trousers", 13, 30, "rainbow"));
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






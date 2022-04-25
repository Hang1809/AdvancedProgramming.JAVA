package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final ArrayList<Product> productList = new ArrayList<>();

    public ProductService(){
        productList.add(new Product ("Cardigan", 5, 50, "blue"));
        productList.add(new Product("Hat", 3, 80, "yellow"));
        productList.add(new Product("Socks", 3, 50, "aquamarine"));
        productList.add(new Product("Cardigan", 5, 20, "orange"));
        productList.add(new Product("Towel", 2, 50, "blue"));

    }

}


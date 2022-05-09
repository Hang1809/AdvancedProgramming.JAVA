package service;

import model.Product;
import java.util.List;

public interface IProductService {
    List<Product> getProduct();

    void add (Product newProduct);

    Product getByID(int id);

    boolean existById(int id);

    void update();

    boolean checkDuplicateName(String name);

    boolean checkDuplicateId(int id);

    void removeProduct(Product product);


}

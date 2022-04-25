package service;

import model.Product;
import java.util.List;

public interface IProductService {
    List<Product> getProduct();

    void add (Product newProduct);
    Product getByID();
    boolean existById();
    void update(Product newProduct);
    void removeById();

}

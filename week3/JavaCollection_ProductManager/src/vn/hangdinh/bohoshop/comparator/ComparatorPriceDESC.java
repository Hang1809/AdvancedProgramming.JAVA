package comparator;
import java.util.Comparator;
import model.Product;

public class ComparatorPriceDESC implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o2.getPrice(), o1.getPrice());
        }
}

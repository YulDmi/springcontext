package lesson1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;


    @PostConstruct
    private void init(){
        products = new ArrayList<>();
        products.add(new Product(1, "шапка-ушанка", 1200.00));
        products.add(new Product(2, "кепка", 400.00));
        products.add(new Product(3, "майка", 800.00));
        products.add(new Product(4, "рубашка", 1500.00));
        products.add(new Product(5, "жилет", 1100.00));
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product getProductById(int id){
        for (Product p : products){
            if (p.getId() == id){
                return p;
            }
        }return null;
    }
}

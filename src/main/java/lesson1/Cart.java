package lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "prototype")
public class Cart {
    private List<Product> productsCart;
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @PostConstruct
    private void init() {
        productsCart = new ArrayList<>();
    }
    public void addProduct(int id) {
        Product p = productRepository.getProductById(id);

        if (p != null) {
            productsCart.add(p);
            getProductsCart();
        }else {
            System.out.println("Продукта с таким id не существует.");
        }
    }
    public void deleteProduct(int id){
        for (Product p : productsCart) {
            if (p.getId() == id){
                productsCart.remove(p);
                break;

            }
        }getProductsCart();
    }
    public void getProductsCart(){
        System.out.println("В вашей корзине находятся товары: " + productsCart);
    }


}

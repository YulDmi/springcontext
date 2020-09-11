package lesson1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
//        System.out.println(productRepository.getProductById(4));
     System.out.println(productRepository.getProducts());


        Cart cart1 = context.getBean("cart", Cart.class);
        cart1.addProduct(1);
        cart1.addProduct(2);
        cart1.deleteProduct(1);
        cart1.addProduct(4);
        cart1.addProduct(7);

        Cart cart2 = context.getBean("cart", Cart.class);
        cart2.addProduct(3);
        cart2.addProduct(5);
        cart2.deleteProduct(5);
        cart2.addProduct(4);

        context.close();
    }
}

package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(UserApplicationConfig.class);

        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        userRepository.printUsers();
        context.close();
    }
}

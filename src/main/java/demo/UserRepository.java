package demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserRepository {

    private List<User> users;

    @PostConstruct
public void init(){
    this.users = new ArrayList<>();
    users.add(new User(1L, "Bob", "dsk@jflsj"));
    users.add(new User(2L,"Tom", "d@skjflsj"));
}
    public void printUsers(){
        for (User u : users){
            System.out.println(u);
        }
    }
}

package com.kushagra.rest.restful_web_services.users;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userAccount = 0;

    static {
        users.add(new User(++userAccount,"Adam", LocalDateTime.now().minusYears(30)));
        users.add(new User(++userAccount,"Eve", LocalDateTime.now().minusYears(25)));
        users.add(new User(++userAccount,"Jim", LocalDateTime.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User saveUser(User user) {
        user.setId(++userAccount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
}

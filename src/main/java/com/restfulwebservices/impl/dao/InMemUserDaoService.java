package com.restfulwebservices.impl.dao;

import com.restfulwebservices.api.dao.UserDaoService;
import com.restfulwebservices.api.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class will provide in memory implementation of users data.
 * We are using {@link List} to store {@link User} data in this implementation.
 */
@Component("InMemUserDeoService")
public class InMemUserDaoService implements UserDaoService {

    //hold users data
    private static List<User> users = new ArrayList<>();

    @Override
    public List<User> fetchAll() {
        return users;
    }

    @Override
    public User save(User user) {
        user.setId(users.size() + 1);
        users.add(user);
        return user;
    }

    @Override
    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    @Override
    public User findByName(String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}

package com.restfulwebservices.impl.service;

import com.restfulwebservices.api.dao.UserDaoService;
import com.restfulwebservices.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    @Qualifier("InMemUserDeoService")
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.fetchAll();
    }

    @PostMapping("/users")
    public boolean createUser(@RequestBody User user) {
        User savedUser = service.save(user);
        return true;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("/users/username/{name}")
    public User getUserById(@PathVariable String name) {
        return service.findByName(name);
    }

    @DeleteMapping("/users/{id}")
    public User deleteUserById(@PathVariable int id) {
        return service.deleteById(id);
    }

}

package com.restfulwebservices.api.dao;

import com.restfulwebservices.api.model.User;

import java.util.List;

/**
 * This interface will provide list of all actions which we can perform on {@link User} resource.
 * We can provide different implementations of this interface based on how we are storing users data.
 */
public interface UserDaoService {

    /**
     * @return list of users
     */
    public List<User> fetchAll();

    /**
     * <p>
     * This function will store user details by assigning auto generated id.
     * </p>
     *
     * @param user details of new user.
     * @return user with auto generated id.
     */
    public User save(User user);

    /**
     * <p>
     * This function will return user having specified id.If invalid id is provided, then this function will return null.
     * </p>
     *
     * @param id user id.
     * @return User instance
     */
    public User findById(int id);

    /**
     * <p>
     * This function will return user having specified name.If there is no user with provided name, then this function will return null.
     * </p>
     *
     * @param name user name.
     * @return User instance
     */
    public User findByName(String name);

    /**
     * <p>
     * This function will delete and return user having specified id.If invalid id is provided, then this function will return null.
     * </p>
     *
     * @param id user id.
     * @return User instance
     */
    public User deleteById(int id);

}

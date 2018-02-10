package com.sk.learn.jpa.springbootjpa.service;

import com.sk.learn.jpa.springbootjpa.model.User;

import java.util.List;

/**
 * @author shankarmodi
 * 10/02/18
 */
public interface UserService {

    List<User> allUsers();

    void save(User user);

    List<User> findByName(String name);
}

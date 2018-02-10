package com.sk.learn.jpa.springbootjpa.service;

import com.sk.learn.jpa.springbootjpa.model.User;
import com.sk.learn.jpa.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shankarmodi
 * 10/02/18
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }


    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }
}

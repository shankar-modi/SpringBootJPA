package com.sk.learn.jpa.springbootjpa.controller;

import com.sk.learn.jpa.springbootjpa.model.User;
import com.sk.learn.jpa.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shankarmodi
 * 10/02/18
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> allUser() {
        return userService.allUsers();
    }

    @PostMapping()
    public String saveUser(@RequestBody User user) {

        userService.save(user);

        return "SUCCESS";
    }

    @GetMapping("/{name}")
    public List<User> findByName(@PathVariable  final String name){

        return userService.findByName(name);
    }
}

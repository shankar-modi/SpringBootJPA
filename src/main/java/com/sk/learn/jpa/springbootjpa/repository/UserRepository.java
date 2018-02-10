package com.sk.learn.jpa.springbootjpa.repository;

import com.sk.learn.jpa.springbootjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author shankarmodi
 * 10/02/18
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);
}

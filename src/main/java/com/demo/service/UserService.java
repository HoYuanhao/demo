package com.demo.service;

import com.demo.models.User;

import java.util.Set;

/**
 * @author Luke
 * @date 2019/6/2 下午4:05
 */
public interface UserService {
  Set<User> getAllUsers();

  User getUserInfo(String userName, String password);
}

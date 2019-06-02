package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.models.User;
import com.demo.service.UserService;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.Set;

/**
 * @author Luke
 * @date 2019/6/2 下午4:06
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;

  @Transactional
  public Set<User> getAllUsers() {
    Cursor<User> userCursor = userDao.getAllUserInfo();
    Set<User> users = Sets.newHashSet();
    Iterator<User> iterator = userCursor.iterator();
    while (iterator.hasNext()) {
      users.add(iterator.next());
    }
    return users;
  }

  public User getUserInfo(String userName, String password) {
    return userDao.getUserInfo(userName, password);
  }
}

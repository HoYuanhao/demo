package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.models.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author Luke
 * @date 2019/6/2 下午4:09
 */
@RestController
@RequestMapping(path = "test")
public class UserController {
  @Autowired
  private UserService userService;

  @RequestMapping(path = "userInfos", produces = "application/json;charset=utf-8")
  @ResponseBody
  public String getAllUserInfo() {
    Set<User> userSet = userService.getAllUsers();
    return JSON.toJSONString(userSet);
  }

  @RequestMapping(path = "userInfo", produces = "application/json;charset=utf-8")
  @ResponseBody
  public User getUserInfo(String username, String password) {
    User user = userService.getUserInfo(username, password);
    System.out.println(JSONObject.toJSONString(user));
    return user;
  }
}

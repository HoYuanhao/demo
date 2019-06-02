package com.demo.dao;

import com.demo.models.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

/**
 * @author Luke
 * @date 2019/6/2 下午3:59
 */
public interface UserDao {

   Cursor<User> getAllUserInfo();

   User getUserInfo(@Param("username") String userName, @Param("password") String password);
}

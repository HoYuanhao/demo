package com.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author Luke
 * @date 2019/6/2 下午3:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
  private String uid;
  private String username;
  private String password;
  private Date createTime;
  private short isDeleted;
  private short isBanned;
  private String role;
  private String email;
}

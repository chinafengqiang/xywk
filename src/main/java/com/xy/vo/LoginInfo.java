package com.xy.vo;

public class LoginInfo implements java.io.Serializable{
  private int userId = 0;
  private String username;
  private String password;
  private String truename;
  private int type;
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getTruename() {
    return truename;
  }
  public void setTruename(String truename) {
    this.truename = truename;
  }
  public int getType() {
    return type;
  }
  public void setType(int type) {
    this.type = type;
  }
  
  
}

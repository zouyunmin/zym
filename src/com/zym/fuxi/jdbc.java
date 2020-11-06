package com.zym.fuxi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc{

  PreparedStatement preparedStatement;
  Connection connection;
  ResultSet resultSet;

  public  void login(String username,String password){
    connection=DUBlit.getConnection();
    String sql="select name,password from text;";
    try {
      preparedStatement = connection.prepareStatement(sql);
      resultSet=preparedStatement.executeQuery();
      while (resultSet.next()){
        String name=resultSet.getString("name");
        String pwd=resultSet.getString("password");
        if (password.equals(pwd) && username.equals(name)){
          System.out.println("登录成功");
          return;
        }else {
          System.out.println("密码错误");
          return;
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      DUBlit.closeDemo(resultSet,preparedStatement,connection);
    }
  }

  public static void main(String[] args){
      jdbc jdbc=new jdbc();
      jdbc.login("ac","123");
  }
}

package com.zym.shopping;

import com.zym.ofo.DBUtlis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {

  /**
   * 查看
   * @return
   */
  public static ArrayList<User> selectUser(){
    ArrayList<User> users=new ArrayList<>();
    try {
      Connection connection=DBUtils1.getConnection();
      String sql="select * from tb_goods";
      PreparedStatement preparedStatement=connection.prepareStatement(sql);
      ResultSet resultSet=preparedStatement.executeQuery();
      while (resultSet.next()){
        int id=resultSet.getInt("id");
        String name=resultSet.getString("name");
        int price=resultSet.getInt("price");
        int store=resultSet.getInt("store");
        User user=new User(id,name,price,store);
        users.add(user);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return users;
  }

  /**
   * 按商品名称查询
   * @param name
   * @return
   */
  public static ArrayList<User> inquire(String name){
    ArrayList<User> users=new ArrayList<>();
    try {
      Connection connection=DBUtils1.getConnection();
      String sql="select * from tb_goods where name=?";
      PreparedStatement preparedStatement=connection.prepareStatement(sql);
      preparedStatement.setString(1,name);
      ResultSet resultSet=preparedStatement.executeQuery();
      while (resultSet.next()){
        int id=resultSet.getInt("id");
        int al;
        String name1=resultSet.getString("name");
        int price=resultSet.getInt("price");
        int store=resultSet.getInt("store");

        int b;
        User user=new User(id,name1,price,store);
        users.add(user);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return users;
  }
}

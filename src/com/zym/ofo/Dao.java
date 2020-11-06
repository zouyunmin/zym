package com.zym.ofo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {

  /**
   *查看
   * @return
   */
  public static ArrayList selectUser(){
    ArrayList<User> users=new ArrayList<>();
    try {
      Connection connection=DBUtlis.getConnection();
      String sql="select * from ofo_users";
      PreparedStatement preparedStatement=connection.prepareStatement(sql);
      ResultSet resultSet=preparedStatement.executeQuery();
      while (resultSet.next()){
        int id=resultSet.getInt("ofo_users_id");
        String name=resultSet.getString("ofo_users_name");
        float balance=resultSet.getFloat("ofo_users_balance");
        float mileage=resultSet.getFloat("ofo_users_mileage");
        User user=new User(id,name,balance,mileage);
        users.add(user);
       //DBUtlis.closed(resultSet,preparedStatement,connection);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return users;
  }

  /**
   * 修改
   * @param name
   * @param balance
   * @param mileage
   * @return
   */
  public static boolean updateUser(int id,String name,float balance,float mileage){
    try {
      Connection connection=DBUtlis.getConnection();
      String sql="update ofo_users set ofo_users_name=?,ofo_users_balance=?,ofo_users_mileage=? where ofo_users_id=? ;";
      PreparedStatement preparedStatement=connection.prepareStatement(sql);
      preparedStatement.setString(1,name);
      preparedStatement.setFloat(2,balance);
      preparedStatement.setFloat(3,mileage);
      preparedStatement.setInt(4,id);
      int n=preparedStatement.executeUpdate();
      if (n>0){
        return true;
      }
      DBUtlis.closed(null,preparedStatement,connection);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  /**
   * 增加
   * @param name
   * @param balance
   * @param mileage
   * @return
   */
  public static boolean insertUser(String name,float balance,float mileage){
    try {
      Connection connection=DBUtlis.getConnection();
      String sql="insert into ofo_users(ofo_users_name,ofo_users_balance,ofo_users_mileage) values (?,?,?)";
      PreparedStatement preparedStatement=connection.prepareStatement(sql);

      preparedStatement.setString(1,name);
      preparedStatement.setFloat(2,balance);
      int b;
      preparedStatement.setFloat(3,mileage);
      int a=preparedStatement.executeUpdate();
      if (a>0){
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  /**
   * 删除
   * @param name
   * @return
   */
  public static boolean deleteUser(String name){
    try {
      Connection connection=DBUtlis.getConnection();
      String sql="delete from ofo_users where ofo_users_name=?";
      PreparedStatement preparedStatement=connection.prepareStatement(sql);
      preparedStatement.setString(1,name);
      int a=preparedStatement.executeUpdate();
      if (a>0){
        System.out.println("删除成功");
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }
}

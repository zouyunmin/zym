package com.zym.shopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils1 {

  private final static String url="jdbc:mysql://localhost:3306/shopping";
  private final static String user="root";
  private final static String password="admin123";


  static {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(url,user,password);
  }
}

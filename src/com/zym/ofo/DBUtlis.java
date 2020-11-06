package com.zym.ofo;

import java.sql.*;

public class DBUtlis {
  private final static  String url="jdbc:mysql://localhost:3306/db_ofo_users?characterEncoding=utf8";
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

  public static void closed(ResultSet resultSet, PreparedStatement preparedStatement,Connection connection){

      try {
        if (resultSet!=null){
          resultSet.close();
        }
        if (preparedStatement!=null){
          preparedStatement.close();
        }
        if (connection!=null){
          connection.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }

  }
}

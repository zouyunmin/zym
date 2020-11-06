package com.zym.fuxi;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class DUBlit extends  JFrame{

  public  static  final  String url="jdbc:mysql://localhost:3306/school";
  public  static  final  String user_name="root";
  public  static  final  String password="admin123";


  static {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection(){
    try {
      Connection connection= DriverManager.getConnection(url,user_name,password);
      return  connection;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return  null;
  }

  public static void closeDemo(ResultSet resultSet, PreparedStatement preparedStatement,Connection connection){
    if (resultSet != null){
      try {
        resultSet.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (preparedStatement !=null){
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (connection != null){
      try {
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  public  void caidan(){
    JFrame jFrame=new JFrame("注册页面");
    jFrame.setBounds(300,300,300,300);
    FlowLayout flowLayout=new FlowLayout();
    jFrame.setLayout(flowLayout);


    JMenuBar jMenuBar=new JMenuBar();

    JMenu jMenu=new JMenu("编辑");
    JMenu jMenu2=new JMenu("打开");

    JMenuItem jMenuItem=new JMenuItem("王家桐喝奶");
    JMenuItem jMenuItem12=new JMenuItem("邓招良喝奶");

    jMenu.add(jMenuItem);
    jMenu.add(jMenuItem12);

    jMenuBar.add(jMenu);
    jMenuBar.add(jMenu2);

    jFrame.add(jMenuBar);

    jFrame.setVisible(true);
  }

  public  void close1(JFrame jFrame){
    this.setVisible(false);
    jFrame.setVisible(true);
  }

}

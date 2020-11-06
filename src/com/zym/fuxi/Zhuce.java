package com.zym.fuxi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Zhuce {
  private JLabel jLabel;
  private JPanel jPanel;
  private JTextField jTextField;
  private JLabel jLabel2;
  private JPasswordField jPasswordField;
  private JButton jButton;



  public Zhuce() {
    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
            String username=jTextField.getText();
            String password=jPasswordField.getText();
            jd(username,password);
      }
    });
  }


  public  void init(){
    JFrame frame = new JFrame("注册");
    frame.setContentPane(new Zhuce().jPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }


  Connection connection=null;
  PreparedStatement preparedStatement=null;
  ResultSet resultSet=null;


  public  boolean jd(String username,String password){
    connection=DUBlit.getConnection();
    try {
      String selectsql="select * from user where username=?;";
      preparedStatement=connection.prepareStatement(selectsql);
      preparedStatement.setString(1,username);
      resultSet=preparedStatement.executeQuery();
      if (resultSet.next()){
        JOptionPane.showMessageDialog(jPanel,"用户名已存在");
        return false;
      }else {
        String sql="insert into user(username,password) values (?,?);";
        preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        int lows=preparedStatement.executeUpdate();
        if (lows>0){
          JOptionPane.showMessageDialog(jPanel,"注册成功");
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      DUBlit.closeDemo(resultSet,preparedStatement,connection);
    }
    return  false;
  }

  public static void main(String[] arga){
      Zhuce zhuce=new Zhuce();
      zhuce.init();
  }
}

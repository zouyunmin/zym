package com.zym.fuxi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Framelogin extends JFrame {



  public  Framelogin(){
    super("登录");
  }

  public  void init(){
    this.setBounds(300,300,400,400);
    this.setLayout(null);

    JLabel jLabel=new JLabel("账号：");
    jLabel.setBounds(0,0,50,30);
    this.add(jLabel);

    JTextField jTextField=new JTextField();
    jTextField.setBounds(80,0,200,30);
    this.add(jTextField);

    JLabel jLabel1=new JLabel("密码：");
    jLabel1.setBounds(0,40,50,30);
    this.add(jLabel1);

    JPasswordField jPasswordField=new JPasswordField();
    jPasswordField.setBounds(80,40,200,30);
    this.add(jPasswordField);

    JButton jButton=new JButton("注册");
    jButton.setBounds(0,90,80,30);
    //设置按钮透明
    jButton.setContentAreaFilled(false);
    //去除边框
    jButton.setBorderPainted(false);
    this.add(jButton);

    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        DUBlit duBlit=new DUBlit();
        duBlit.caidan();
        duBlit.close1(duBlit);
      }
    });

    JButton jButton1=new JButton("登录");
    jButton1.setBounds(80,90,200,30);
    this.add(jButton1);

    jButton1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String uname=jTextField.getText();
        String pwd=jPasswordField.getText();
        if (login(uname,pwd)==true){
          jButton1.setText("登录成功");
        }else {
          jButton1.setText("登录失败");
          System.out.println("登录失败");
        }
      }
    });

    this.setVisible(true);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public boolean login(String uname,String pwd){
    //文本框输入的
    System.out.println("用户名："+uname+"\t密码"+pwd);

    Connection connection = null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    try {
      connection= DUBlit.getConnection();
      String sql="select * from user;";


      preparedStatement=connection.prepareStatement(sql);
      resultSet=preparedStatement.executeQuery();
      while (resultSet.next()){
        String name=resultSet.getString("username");
        String password=resultSet.getString("password");
        //数据库查询的
        System.out.println("用户名："+name +"\t密码"+ password);

        if (uname.equals(name) && pwd.equals(password)){
          System.out.println("登录成功");
          return true;
        }

      }
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      DUBlit.closeDemo(resultSet,preparedStatement,connection);
    }
    return false;
  }

  public static void main(String[] args){
     Framelogin framelogin=new Framelogin();
     framelogin.init();
  }
}

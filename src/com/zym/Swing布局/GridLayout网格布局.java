package com.zym.Swing布局;

import javax.swing.*;
import java.awt.*;

public class GridLayout网格布局 {
  public static void main(String[] args){
    JFrame jFrame=new JFrame();
    jFrame.setBounds(300,300,300,300);

    GridLayout gridLayout=new GridLayout();
    gridLayout.setRows(3);
    //gridLayout.setColumns(1);
    jFrame.setLayout(gridLayout);

    jFrame.add(new JLabel("用户名:"));
    jFrame.add(new JTextField());
    jFrame.add(new JLabel("密码:"));
    jFrame.add(new JPasswordField());
    jFrame.add(new JButton("登录"));


    jFrame.setVisible(true);
  }
}

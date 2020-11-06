package com.zym.Swing布局;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
  public static void main(String[] args){
    JFrame jFrame=new JFrame("JPanel");
    BorderLayout borderLayout=new BorderLayout();
    jFrame.getContentPane().setLayout(borderLayout);

    JPanel jPanel=new JPanel();
    GridLayout gridLayout=new GridLayout();
    gridLayout.setRows(2);
    jPanel.setLayout(gridLayout);

    JLabel jLabel=new JLabel("用户名");
    JTextField jTextField=new JTextField();

    jPanel.add(jLabel);
    jPanel.add(jTextField);

    jFrame.add(jPanel,borderLayout.NORTH);

    JLabel jLabel2=new JLabel("密码");
    JPasswordField jPasswordField=new JPasswordField();

    jPanel.add(jLabel2);
    jPanel.add(jPasswordField);
    jFrame.add(jPanel,borderLayout.CENTER);

    JButton jButton=new JButton("登录");
    jFrame.add(jButton,borderLayout.SOUTH);

    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    jFrame.setBounds(300,300,300,300);
    jFrame.setVisible(true);
  }
}
